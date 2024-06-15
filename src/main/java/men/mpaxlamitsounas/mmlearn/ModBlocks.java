package men.mpaxlamitsounas.mmlearn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Mud;

public class ModBlocks {

    public static CastleRoofTile castleRoofTile = new CastleRoofTile();
    public static Mud mud = new Mud();

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        castleRoofTile.initModel();
        mud.initModel();
    }

    public static Item asItemBlock(Block block) {
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }

    @SideOnly(Side.CLIENT)
    public static void renderFluidBlocks() {
        // lemonadeBlock.render();
    }
}
