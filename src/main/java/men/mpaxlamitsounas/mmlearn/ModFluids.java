package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fluids.FluidRegistry;

import men.mpaxlamitsounas.mmlearn.fluids.CustomFluid;
import men.mpaxlamitsounas.mmlearn.fluids.Lemonade;

public class ModFluids {

    public static CustomFluid lemonade = new Lemonade();

    public static void registerFluids() {
        FluidRegistry.registerFluid(lemonade);
    }

    public static void addBuckets() {
        FluidRegistry.addBucketForFluid(lemonade);
    }
}
