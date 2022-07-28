package net.minecraft.client.gui;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiButtonClient extends GuiButton
{
    public GuiButtonClient(int buttonID, int xPos, int yPos, int w, int h, String buttonText)
    {
        super(buttonID, xPos, yPos, w, h, buttonText);
        this.buttonString = buttonText;
    }
    
    private String buttonString;
    
    

    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if (this.visible)
        {
            
  
        	
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            Gui.drawRect(xPosition, yPosition, xPosition + width, yPosition + height,  new Color(34, 35, 42, 255).getRGB());
            boolean flag = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int i = 106;

            if (flag)
            {
            	GlStateManager.color(1, 1, 1, 1);
            	Gui.drawRect(xPosition, yPosition, xPosition + width, yPosition + height,  new Color(0, 0, 50, 170).getRGB());
            }
            
            GlStateManager.color(1, 1, 1, 1);
            this.drawCenteredString(mc.fontRendererObj, buttonString, xPosition, yPosition, -1);
            
            
            

        }
    }
}
