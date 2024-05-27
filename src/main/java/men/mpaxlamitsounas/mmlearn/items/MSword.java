package men.mpaxlamitsounas.mmlearn.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mmlearn.ModMaterials;
import men.mpaxlamitsounas.mmlearn.Tags;
import men.mpaxlamitsounas.mmlearn.util.EntityLightningBoltCustom;

public class MSword extends ItemSword {

    public MSword() {
        super(ModMaterials.OBSIDIAN);
        this.setTranslationKey(Tags.MODID + ".msword")
                .setRegistryName("msword");
    }

    @Override
    // I sure hope this works in general
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        stack.addEnchantment(Enchantments.FIRE_ASPECT, 1);
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
