package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Mud;

public class ModBlocks {

    @GameRegistry.ObjectHolder("mmlearn:castle_roof_tile")
    public static CastleRoofTile castleRoofTile;
    @GameRegistry.ObjectHolder("mmlearn:mud")
    public static Mud mud;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        castleRoofTile.initModel();
        mud.initModel();
    }
}
