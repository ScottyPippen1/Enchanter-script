package main.branches;

import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.map.Area;

import api.Node;
import api.NodeBranch;
import main.leafs.OpenBankLeaf;
import main.leafs.WalkToBankLeaf;

public class NearBankBranch extends NodeBranch{
	
	private final Area ge = new Area(3161, 3486, 3168, 3489, 0);
	
	private final Node bankleaf = new OpenBankLeaf();
	private final Node walkleaf = new WalkToBankLeaf();
	
	@Override
	public Node isTrue() {
		return bankleaf;
	}

	@Override
	public Node isFalse() {
		return walkleaf;
	}

	@Override
	public boolean validate(MethodContext context) {
		return ge.contains(context.getLocalPlayer());
	}

}
