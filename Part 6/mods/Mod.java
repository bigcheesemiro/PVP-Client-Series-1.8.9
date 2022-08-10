package clientname.mods;


import java.io.File;

import org.apache.logging.log4j.core.appender.FileManager;

import clientname.Client;
import clientname.event.EventManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

public class Mod {
	
	private boolean isEnabled = true;
	
	protected final Minecraft mc;
	protected final FontRenderer font;
	protected final Client client;
	
	public String name, description;
	
	public Mod(String name, String description) {
		this.mc = Minecraft.getMinecraft();
		this.font = this.mc.fontRendererObj;
		this.client = Client.INSTANCE;
		
		this.name = name;
		this.description = description;
		
		isEnabled = isEnabled();

	}
	

	public void setEnabled(boolean isEnabled) {
		
		if(isEnabled) {
			EventManager.register(this);
		} else {
			EventManager.unregister(this);
		}
		
	}
	
	public boolean isEnabled()
	{
		return isEnabled;
	}
	
	public void toggle() {
		isEnabled = (!isEnabled());
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
}
