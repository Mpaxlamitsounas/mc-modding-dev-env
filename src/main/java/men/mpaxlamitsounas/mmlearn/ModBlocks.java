package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Shit;

public class ModBlocks {

    @GameRegistry.ObjectHolder("mmlearn:castle_roof_tile")
    public static CastleRoofTile castleRoofTile;
    @GameRegistry.ObjectHolder("mmlearn:shit")
    public static Shit shit;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        castleRoofTile.initModel();
        shit.initModel();
    }
}
