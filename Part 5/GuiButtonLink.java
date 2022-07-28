package net.minecraft.client.gui;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiButtonLink extends GuiButton
{
    public GuiButtonLink(int buttonID, int xPos, int yPos)
    {
        super(buttonID, xPos, yPos, 20, 20, "");
    }

    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if (this.visible)
        {
            mc.getTextureManager().bindTexture(new ResourceLocation("client/ui/globe.png"));
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            boolean flag = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int i = 106;

            if (flag)
            {
                i += this.height;
            }
            
            GlStateManager.color(1, 1, 1, 1);
            GuiImage.drawImage(xPosition, yPosition, 20, 20, "client/ui/globe.png");

        }
    }
}
