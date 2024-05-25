package men.mpaxlamitsounas.mplearn.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.myname.mymodid.Tags;

public class CastleRoofTile extends Block {

    public CastleRoofTile() {
        super(Material.ROCK);
        setTranslationKey(Tags.MODID + ".castle_roof_tile");
        setRegistryName("castle_roof_tile");
        this.setCreativeTab(CreativeTabs.DECORATIONS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
