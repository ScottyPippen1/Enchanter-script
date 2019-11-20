package main.leafs;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;

import api.NodeLeaf;

public class WithdrawCosmicRuneLeaf extends NodeLeaf {

	@Override
	public int onLoop(MethodContext context) {
		if(context.getBank().contains("Cosmic rune")){
			context.getBank().withdrawAll("Cosmic rune");
			MethodProvider.sleep(Calculations.random(800, 1500));
		}
		return 0;
	}

}
