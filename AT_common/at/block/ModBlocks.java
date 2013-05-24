package at.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import at.lib.BlockIds;
import at.lib.Strings;

public class ModBlocks {
    
    
    public static Block titanOre;
    

    public static void init(){
        
        titanOre = new BlockTitanOre(BlockIds.titanOreID,Material.iron).setUnlocalizedName("tiletitanore");
    
        
        
        gameRegisters();
        languageRegisters();
    }
    
    
    
    private static void gameRegisters(){
        GameRegistry.registerBlock(titanOre,Strings.TITAN_ORE_NAME);
    }
    
    
    
    private static void languageRegisters(){
        LanguageRegistry.addName(titanOre, "Titan Ore");
    }
}
