package at;

import net.minecraft.creativetab.CreativeTabs;
import at.block.ModBlocks;
import at.common.WorldGeneratorAT;
import at.core.proxy.ClientProxy;
import at.creativetab.CreativeTabBlocks;
import at.creativetab.CreativeTabItems;
import at.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class AdvancedTechnology {
    
    @SidedProxy(clientSide = "at.core.proxy.ClientProxy",
                serverSide = "at.core.proxy.CommonProxy")
    public static ClientProxy proxy = new ClientProxy();  
    
    public static CreativeTabs tabsBlocks = new CreativeTabBlocks(CreativeTabs.getNextID(), "tabsBlocks");
    //public static CreativeTabs tabsItems = new CreativeTabItems(CreativeTabs.getNextID(), "tabsItems");
    
  @Init  
    public void load(FMLInitializationEvent event){
      
      // Initialize mod items
      ModBlocks.init();
  
      proxy.registerRenders();
      GameRegistry.registerWorldGenerator(new WorldGeneratorAT());
          
  }

}

