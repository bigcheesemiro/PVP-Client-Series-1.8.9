package clientname.mods;


import java.io.File;

import clientname.hud.IRenderer;
import clientname.hud.ScreenPosition;


public abstract class ModDraggable extends Mod implements IRenderer{
	
	public ModDraggable(String name, String description) {
		super(name, description);
	}
  
	protected ScreenPosition pos;
  
	@Override
	public ScreenPosition load() {
		return pos;
	}
	
	@Override
	public void save(ScreenPosition pos) {
		this.pos = pos;
	}


	public final int getLineOffset(ScreenPosition pos, int lineNum) {
		return pos.getAbsoluteY() + getLineOffset(lineNum);
	}
	
	private int getLineOffset(int lineNum) {
		return(font.FONT_HEIGHT + 3) * lineNum;
	}
	
}
