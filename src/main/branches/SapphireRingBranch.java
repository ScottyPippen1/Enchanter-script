package main.branches;

import org.dreambot.api.methods.MethodContext;

import api.Node;
import api.NodeBranch;
import main.leafs.EnchantRingLeaf;

public class SapphireRingBranch extends NodeBranch {

	private final Node enchantringleaf = new EnchantRingLeaf();
	private final Node bankbranch = new IsBankOpenBranch();
	
	@Override
	public Node isTrue() {
		return enchantringleaf;
	}

	@Override
	public Node isFalse() {
		return bankbranch;
	}

	@Override
	public boolean validate(MethodContext context) {
		return (context.getInventory().contains("Sapphire ring") & context.getInventory().contains("Cosmic rune"));
	}

}
