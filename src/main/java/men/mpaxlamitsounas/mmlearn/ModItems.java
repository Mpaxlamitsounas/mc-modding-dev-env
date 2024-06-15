package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.items.MSword;
import men.mpaxlamitsounas.mmlearn.items.Mudball;

public class ModItems {

    public static MSword mSword = new MSword();
    public static Mudball mudball = new Mudball();

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        mSword.initModel();
        mudball.initModel();
    }
}
