package main.leafs;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;
import org.dreambot.api.methods.map.Area;

import api.NodeLeaf;

public class WalkToBankLeaf extends NodeLeaf {
	
	private final Area ge = new Area(3161, 3486, 3168, 3489, 0);
	
	@Override
	public int onLoop(MethodContext context) {
		if(context.getWalking().walk(ge.getRandomTile())){
			MethodProvider.sleepUntil(() -> ge.contains(context.getLocalPlayer()), Calculations.random(2000, 5000));
		}
		return 0;
	}

}
