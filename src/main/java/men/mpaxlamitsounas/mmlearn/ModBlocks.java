package men.mpaxlamitsounas.mmlearn;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Mud;
import men.mpaxlamitsounas.mmlearn.fluids.blocks.ModFluidBlock;

public class ModBlocks {

    public static CastleRoofTile castleRoofTile = new CastleRoofTile();
    public static Mud mud = new Mud();
    public static ModFluidBlock lemonadeBlock = new ModFluidBlock(ModFluids.lemonade, Material.WATER);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        castleRoofTile.initModel();
        mud.initModel();
        lemonadeBlock.initModel();
    }

    public static Item asItemBlock(Block block) {
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }
}
