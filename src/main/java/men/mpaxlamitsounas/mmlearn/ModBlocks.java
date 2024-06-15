package men.mpaxlamitsounas.mmlearn;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Mud;
import men.mpaxlamitsounas.mmlearn.fluids.blocks.ModFluidBlock;

public class ModBlocks {

    @GameRegistry.ObjectHolder("mmlearn:castle_roof_tile")
    public static CastleRoofTile castleRoofTile;
    @GameRegistry.ObjectHolder("mmlearn:mud")
    public static Mud mud;

    public static final ModFluidBlock LEMONADE_BLOCK = new ModFluidBlock(ModFluids.lemonade, Material.WATER);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        castleRoofTile.initModel();
        mud.initModel();
    }
}
