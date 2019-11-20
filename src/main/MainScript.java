package main;

import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

import api.NodeBranch;
import api.TreeScript;
import main.branches.SapphireRingBranch;

@ScriptManifest(author = "Marcusarailus", name = "Enchanter2.0", version = 1.0, description = "Enchants rings", category = Category.MAGIC)
public class MainScript extends TreeScript {
	
	@Override
	public NodeBranch getRootBranch() {
		return new SapphireRingBranch();
	}

}
