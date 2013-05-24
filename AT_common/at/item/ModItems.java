package at.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import at.lib.BlockIds;
import at.lib.ItemIds;
import at.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {

    public static Item titanIngot;
    
    public static void init(){
        
        titanIngot = new ItemTitanIngot(ItemIds.titanIngotID).setUnlocalizedName("ingottitan");
    
    
        gameRegisters();
        languageRegisters();
    }

    private static void languageRegisters() {
        LanguageRegistry.addName(titanIngot, "Titan Ingot"); 
    }

    private static void gameRegisters() {
        GameRegistry.registerItem(titanIngot,Strings.TITAN_INGOT_NAME);
    }
   
}
