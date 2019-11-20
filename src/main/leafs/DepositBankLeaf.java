package main.leafs;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;

import api.NodeLeaf;

public class DepositBankLeaf extends NodeLeaf {

	@Override
	public int onLoop(MethodContext context) {
		if(context.getBank().depositAll("Ring of recoil")){
			MethodProvider.sleep(Calculations.random(800, 1500));
		}
		return 0;
	}

}
