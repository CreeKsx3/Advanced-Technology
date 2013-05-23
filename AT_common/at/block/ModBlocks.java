package at.block;

import at.lib.BlockIds;
import at.lib.Strings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {

    /* Mod block instances */
    public static Block titanOre;
    
    public static void init() {

        titanOre = new BlockTitanOre(BlockIds.TITAN_ORE);
        
        GameRegistry.registerBlock(titanOre, Strings.TITAN_ORE_NAME);
        
        LanguageRegistry.addName(titanOre, "Titan Ore");
        
        initBlockRecipes();
    }
        
        private static void initBlockRecipes() {
        }
}
