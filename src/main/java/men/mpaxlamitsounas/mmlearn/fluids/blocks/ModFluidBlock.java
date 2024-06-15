package men.mpaxlamitsounas.mmlearn.fluids.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.Tags;

public class ModFluidBlock extends BlockFluidClassic {

    // TODO: make this one render too when I get fluid to stop acting up
    public ModFluidBlock(Fluid fluid, Material material) {
        super(fluid, material);
        this.setTranslationKey(Tags.MODID + "." + fluid.getName())
                .setRegistryName(fluid.getName());
    }

    @SideOnly(Side.CLIENT)
    public void render() {
        ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
    }
}
