package at;

import net.minecraft.creativetab.CreativeTabs;
import at.block.ModBlocks;
import at.core.proxy.CommonProxy;
import at.core.util.LogHelper;
import at.creativetab.CreativeTabAT;
import at.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class AdvancedTechnology {
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabsAT = new CreativeTabAT(CreativeTabs.getNextID(), Reference.MOD_ID);


    @PreInit
    public void preInit(FMLPreInitializationEvent event) {

        // Initialize the log helper
        LogHelper.init();

        // Load the localization files into the LanguageRegistry
        
        // Initialize the configuration
       
        // Conduct the version check and log the result
      
        // Initialize the Version Check Tick Handler (Client only)
        
        // Initialize the Render Tick Handler (Client only)
        
        // Register the KeyBinding Handler (Client only)
       
        // Register the Sound Handler (Client only)
       
        // Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
       
    }

    @Init
    public void load(FMLInitializationEvent event) {

        // Register the GUI Handler
        
        // Register the PlayerDestroyItem Handler
        
        // Register the Item Pickup Handler
       
        // Register the EntityLiving Handler
       
        // Register the DrawBlockHighlight Handler
        
        // Initialize mod tile entities
        
        // Initialize custom rendering and pre-load textures (Client only)
       
        // Load the Transmutation Stone recipes
        //RecipesTransmutationStone.init();

        // Add in the ability to dye Alchemical Bags
        
        // Register the Fuel Handler
        
    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event) {

        // Initialize the Addon Handler
        
    }
}