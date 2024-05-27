package men.mpaxlamitsounas.mmlearn.fluids;

import java.awt.*;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import men.mpaxlamitsounas.mmlearn.Tags;

public class Piss extends Fluid {

    public Piss() {
        super("piss", new ResourceLocation("blocks/water_still"), new ResourceLocation("blocks/water_flow"),
                new ResourceLocation("blocks/water_overlay"));
        this.setColor(Color.YELLOW)
                .setTemperature(309);
    }
}
