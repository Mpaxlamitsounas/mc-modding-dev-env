package men.mpaxlamitsounas.mmlearn;

import men.mpaxlamitsounas.mmlearn.fluids.CustomFluid;
import men.mpaxlamitsounas.mmlearn.fluids.Lemonade;

public class ModFluids {

    public static CustomFluid lemonade;

    public static void registerFluids() {
        lemonade = new Lemonade();
    }
}
