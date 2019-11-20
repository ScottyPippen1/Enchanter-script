package main.branches;

import org.dreambot.api.methods.MethodContext;

import api.Node;
import api.NodeBranch;
import main.leafs.WithdrawCosmicRuneLeaf;
import main.leafs.WithdrawSapphireRingLeaf;

public class CosmicRuneBranch extends NodeBranch {

	private final Node withdrawsapphireringleaf = new WithdrawSapphireRingLeaf();
	private final Node withdrawcosmicruneleaf = new WithdrawCosmicRuneLeaf();
	
	@Override
	public Node isTrue() {
		return withdrawsapphireringleaf;
	}

	@Override
	public Node isFalse() {
		return withdrawcosmicruneleaf;
	}

	@Override
	public boolean validate(MethodContext context) {
		return context.getInventory().contains("Cosmic rune");
	}

}
