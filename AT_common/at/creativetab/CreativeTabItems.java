package at.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import at.lib.ItemIds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabItems extends CreativeTabs{

    public CreativeTabItems(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    
    public int getTabIconItemIndex(){
        
        return ItemIds.titanIngotID;
    }
}
