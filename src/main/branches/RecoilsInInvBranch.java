package main.branches;

import org.dreambot.api.methods.MethodContext;

import api.Node;
import api.NodeBranch;
import main.leafs.DepositBankLeaf;

public class RecoilsInInvBranch extends NodeBranch {
	
	private final Node depositbankleaf = new DepositBankLeaf();
	private final Node cosmicrunebranch = new CosmicRuneBranch();

	@Override
	public Node isTrue() {
		return depositbankleaf;
	}

	@Override
	public Node isFalse() {
		return cosmicrunebranch;
	}

	@Override
	public boolean validate(MethodContext context) {
		return context.getInventory().contains("Ring of recoil");
	}

}
