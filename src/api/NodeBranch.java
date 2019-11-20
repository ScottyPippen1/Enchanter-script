package api;

import org.dreambot.api.methods.MethodContext;

public abstract class NodeBranch extends Node {
	
	public abstract Node isTrue();
	
	public abstract Node isFalse();
	
	@Override
	public int onLoop(MethodContext context){
		Node left = isTrue();
		Node right = isFalse();
		return validate(context) ? left.onLoop(context) : right.onLoop(context);
	}
}
