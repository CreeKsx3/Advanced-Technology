package at.creativetab;

import at.lib.BlockIds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBlocks extends CreativeTabs{

    public CreativeTabBlocks(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    
    public int getTabIconItemIndex(){
        
        return BlockIds.titanOreID;
    }
}
