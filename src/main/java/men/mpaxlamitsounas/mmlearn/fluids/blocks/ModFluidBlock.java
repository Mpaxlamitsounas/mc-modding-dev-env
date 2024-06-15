package men.mpaxlamitsounas.mmlearn.fluids.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import men.mpaxlamitsounas.mmlearn.Tags;

public class ModFluidBlock extends BlockFluidClassic {

    // TODO: make this one render too when I get fluid to stop acting up
    public ModFluidBlock(Fluid fluid, Material material) {
        super(fluid, material);
        this.setTranslationKey(Tags.MODID + "." + fluid.getName())
                .setRegistryName(fluid.getName());
    }
}
