package net.cogden1.wheeloftime.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.container.PickingTableContainer;
import net.minecraft.client.gui.IProgressMeter;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class PickingTableScreen extends ContainerScreen<PickingTableContainer> {

    private final ResourceLocation GUI = new ResourceLocation(WheelOfTime.MOD_ID,
            "textures/gui/picking_table_gui.png");

    public PickingTableScreen(PickingTableContainer container, PlayerInventory p_i51105_2_, ITextComponent p_i51105_3_) {
        super(container, p_i51105_2_, p_i51105_3_);
    }

    @Override
    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        this.renderBackground(p_230430_1_);
        super.render(p_230430_1_,p_230430_2_,p_230430_3_,p_230430_4_);
        this.renderTooltip(p_230430_1_,p_230430_2_,p_230430_3_);
    }

    @Override
    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        RenderSystem.color4f(1f,1f,1f,1f);
        this.minecraft.getTextureManager().bind(GUI);
        int i = this.getGuiLeft();
        int j = this.getGuiTop();
        int posX = (this.width - this.imageWidth) / 2;
        int posY = (this.height - this.imageHeight) / 2;
        this.blit(p_230450_1_,i,j,0,0,this.getXSize(),this.getYSize());


        this.blit(p_230450_1_,posX + 81,posY + 8,176,0, 15,20);
    }
}
