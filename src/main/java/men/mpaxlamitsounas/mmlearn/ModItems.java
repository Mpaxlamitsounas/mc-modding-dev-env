package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.items.MSword;

public class ModItems {

    @GameRegistry.ObjectHolder("mmlearn:msword")
    public static MSword mSword;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        mSword.initModel();
    }
}
