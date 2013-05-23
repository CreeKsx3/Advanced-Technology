package at.block;

import at.AdvancedTechnology;
import at.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTitanOre extends BlockAT {

    public BlockTitanOre(int id) {
        
        super(id, Material.iron);
        this.setUnlocalizedName(Strings.TITAN_ORE_NAME);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        this.setCreativeTab(AdvancedTechnology.tabsAT);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
    }
    @Override
    public void breakBlock(World world, int x, int y, int z, int id, int meta) {

        super.breakBlock(world, x, y, z, id, meta);
    }
}
