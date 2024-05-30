package men.mpaxlamitsounas.mmlearn.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.ModItems;
import men.mpaxlamitsounas.mmlearn.Tags;

public class Mud extends Block {

    public Mud() {
        super(Material.GROUND);
        this.setSoundType(SoundType.SLIME)
                .setCreativeTab(CreativeTabs.DECORATIONS)
                .setTranslationKey(Tags.MODID + ".mud")
                .setRegistryName("mud")
                .setCreativeTab(CreativeTabs.DECORATIONS)
                .setHardness(0.5F)
                .setHarvestLevel("shovel", 0);
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.posY -= 0.5F;
    }

    @Override
    public boolean isStickyBlock(IBlockState state) {
        return true;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.mudball;
    }

    public int quantityDropped(Random random) {
        return 3 + random.nextInt(2);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
