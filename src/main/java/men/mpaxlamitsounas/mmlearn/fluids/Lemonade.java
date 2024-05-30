package men.mpaxlamitsounas.mmlearn.fluids;

import java.awt.*;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class Lemonade extends Fluid {

    public Lemonade() {
        super("lemonade", new ResourceLocation("blocks/water_still"), new ResourceLocation("blocks/water_flow"),
                new ResourceLocation("blocks/water_overlay"));
        this.setColor(Color.YELLOW)
                .setTemperature(309);
    }
}
