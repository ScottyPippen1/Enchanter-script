package main.leafs;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;

import api.NodeLeaf;

public class WithdrawSapphireRingLeaf extends NodeLeaf {

	@Override
	public int onLoop(MethodContext context) {
		if(context.getBank().contains("Sapphire ring")){
			context.getBank().withdrawAll("Sapphire ring");
			MethodProvider.sleep(Calculations.random(800, 1500));
		}
		return 0;
	}

}
