package men.mpaxlamitsounas.mmlearn;

import java.awt.*;

import net.minecraftforge.fluids.FluidRegistry;

import men.mpaxlamitsounas.mmlearn.fluids.Lemonade;
import men.mpaxlamitsounas.mmlearn.fluids.ModFluid;

public class ModFluids {

    public static final ModFluid lemonade = new Lemonade();

    public static void registerFluids() {
        FluidRegistry.registerFluid(lemonade);

        FluidRegistry.addBucketForFluid(lemonade);
    }
}
