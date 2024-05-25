package men.mpaxlamitsounas.mplearn;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mplearn.items.MSword;

public class ModItems {

    @GameRegistry.ObjectHolder("mplearn:msword")
    public static MSword mSword;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        mSword.initModel();
    }
}
