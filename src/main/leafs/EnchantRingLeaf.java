package main.leafs;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;
import org.dreambot.api.methods.magic.Normal;
import org.dreambot.api.methods.tabs.Tab;
import org.dreambot.api.wrappers.items.Item;

import api.NodeLeaf;

public class EnchantRingLeaf extends NodeLeaf {

	@Override
	public int onLoop(MethodContext context) {
		if(!context.getBank().isOpen()){
			Item sapphireRing = context.getInventory().get("Sapphire ring");
			if(!context.getMagic().isSpellSelected()){
				if(!context.getTabs().isOpen(Tab.MAGIC)){
					context.getTabs().open(Tab.MAGIC);
				}
				else{
					if(context.getMagic().castSpell(Normal.LEVEL_1_ENCHANT)){
						
					}
				}
			}
			else{
				sapphireRing.interact();
				MethodProvider.sleepUntil(() -> (context.getTabs().isOpen(Tab.MAGIC)), 999);
			}
		}
		else{
			context.getBank().close();
			MethodProvider.sleep(Calculations.random(800, 1500));
		}
		return Calculations.random(0, 600);
	}

}
