package men.mpaxlamitsounas.mplearn.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.mplearn.ModMaterials;
import men.mpaxlamitsounas.mplearn.Tags;

import java.util.HashMap;
import java.util.HashSet;
@Mod.EventBusSubscriber(Side.SERVER)
public class MSword extends ItemSword {

    public static HashMap<EntityLivingBase, Long> immuneToLightningDuration = new HashMap<EntityLivingBase, Long>();
    public MSword() {
        super(ModMaterials.OBSIDIAN);
        this.setTranslationKey(Tags.MODID + ".msword").setRegistryName("msword");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        target.world.addWeatherEffect( new EntityLightningBolt(target.world, target.posX, target.posY, target.posZ,
                true));
        stack.damageItem(1, attacker);
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
