package men.mpaxlamitsounas.mplearn.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mplearn.ModMaterials;
import men.mpaxlamitsounas.mplearn.Tags;
import men.mpaxlamitsounas.mplearn.util.EntityLightningBoltCustom;

@Mod.EventBusSubscriber(Side.SERVER)
public class MSword extends ItemSword {
// TODO: make sword light on fire (any way you want)
    public MSword() {
        super(ModMaterials.OBSIDIAN);
        this.setTranslationKey(Tags.MODID + ".msword").setRegistryName("msword");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.world.addWeatherEffect(
                new EntityLightningBoltCustom(target.world, target.posX, target.posY + 1.0F, target.posZ,
                        false));
        stack.damageItem(1, attacker);
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
