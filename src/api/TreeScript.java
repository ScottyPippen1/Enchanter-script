package api;

import org.dreambot.api.script.AbstractScript;

public abstract class TreeScript extends AbstractScript {
	
	public abstract NodeBranch getRootBranch();
	
	@Override
	public int onLoop(){
		return getRootBranch().onLoop(this);
	}
}
