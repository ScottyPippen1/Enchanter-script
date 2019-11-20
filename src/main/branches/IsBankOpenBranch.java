package main.branches;

import org.dreambot.api.methods.MethodContext;

import api.Node;
import api.NodeBranch;

public class IsBankOpenBranch extends NodeBranch {

	private final Node recoilininvbranch = new RecoilsInInvBranch();
	private final Node bankbranch = new NearBankBranch();
	
	@Override
	public Node isTrue() {
		return recoilininvbranch;
	}

	@Override
	public Node isFalse() {
		return bankbranch;
	}

	@Override
	public boolean validate(MethodContext context) {
		return context.getBank().isOpen();
	}

}
