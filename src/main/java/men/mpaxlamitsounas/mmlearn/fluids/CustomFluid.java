package men.mpaxlamitsounas.mmlearn.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import men.mpaxlamitsounas.mmlearn.Tags;

public class CustomFluid extends Fluid {

    // TODO: the texture doesn't work, but I haven't managed to get it to work over the course of 3 days, so FUCK this
    // for now
    public CustomFluid(String name) {
        super(name, new ResourceLocation(Tags.MODID, "blocks/fluids/" + name + "_still"),
                new ResourceLocation(Tags.MODID, "blocks/fluids/" + name + "_flowing"));
    }
}
