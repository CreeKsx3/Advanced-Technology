package at.block;

import java.util.Random;

import at.AdvancedTechnology;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockTitanOre extends Block {

    public BlockTitanOre(int id, Material mat) {
        super(id, mat);
        this.setCreativeTab(AdvancedTechnology.tabsBlocks);
        this.setHardness(5.0f);
    }

    @Override
    public void registerIcons(IconRegister reg){
        this.blockIcon = reg.registerIcon("at:TitanOre");
    }

    public int idDropped(int par1, Random rand, int par2){
        return this.blockID;
    }
    
    public int quantityDropped(Random rand){
        return 1;
    }
}
