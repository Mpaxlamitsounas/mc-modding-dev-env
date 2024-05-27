package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.items.MSword;
import men.mpaxlamitsounas.mmlearn.items.Turd;

public class ModItems {

    @GameRegistry.ObjectHolder("mmlearn:msword")
    public static MSword mSword;
    @GameRegistry.ObjectHolder("mmlearn:turd")
    public static Turd turd;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        mSword.initModel();
        turd.initModel();
    }
}
