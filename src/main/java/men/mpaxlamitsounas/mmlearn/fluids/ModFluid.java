package men.mpaxlamitsounas.mmlearn.fluids;

import java.awt.*;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import men.mpaxlamitsounas.mmlearn.Tags;

public class ModFluid extends Fluid {

    // TODO: the texture doesn't work, but I haven't to get it to work over the course of 3 days, so FUCK this for now
    public ModFluid(String name) {
        super(name, new ResourceLocation(Tags.MODID, "fluids/" + name + "_still"),
                new ResourceLocation(Tags.MODID, "fluids/" + name + "_flowing"));
    }
}
