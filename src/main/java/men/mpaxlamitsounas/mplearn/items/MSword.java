package men.mpaxlamitsounas.mplearn.items;

import men.mpaxlamitsounas.mplearn.Tags;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mplearn.ModMaterials;

public class MSword extends ItemSword {

    public MSword() {
        super(ModMaterials.OBSIDIAN);
        setTranslationKey(Tags.MODID + ".msword");
        setRegistryName("msword");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
