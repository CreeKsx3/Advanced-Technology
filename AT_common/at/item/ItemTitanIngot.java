package at.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import at.AdvancedTechnology;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemTitanIngot extends Item {

    public ItemTitanIngot(int par1) {
        super(par1);
        this.setCreativeTab(AdvancedTechnology.tabsBlocks);
    }

    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon("at:TitanIngot");
    }
}
