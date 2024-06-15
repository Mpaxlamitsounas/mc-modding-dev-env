package men.mpaxlamitsounas.mmlearn.util;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityLightningBoltCustom extends EntityLightningBolt {

    private int lightningState;
    public long boltVertex;
    private int boltLivingTime;
    private final boolean effectOnly;

    public EntityLightningBoltCustom(World worldIn, double x, double y, double z, boolean effectOnlyIn) {
        super(worldIn, x, y, z, true);
        this.setLocationAndAngles(x, y, z, 0.0F, 0.0F);
        this.lightningState = 2;
        this.boltVertex = this.rand.nextLong();
        this.boltLivingTime = 2;
        this.effectOnly = effectOnlyIn;
    }

    @Override
    public void onUpdate() {
        if (this.lightningState == 2) {
            this.world.playSound(null, this.posX, this.posY, this.posZ,
                    SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.WEATHER, 0.15F,
                    0.8F + this.rand.nextFloat() * 0.2F);
            this.world.playSound(null, this.posX, this.posY, this.posZ,
                    SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.WEATHER, 0.35F,
                    0.5F + this.rand.nextFloat() * 0.2F);
        }

        --this.lightningState;

        if (this.lightningState < 0) {
            if (this.boltLivingTime == 0) {
                this.setDead();
            } else if (this.lightningState < -this.rand.nextInt(10)) {
                --this.boltLivingTime;
                this.lightningState = 1;

            }
        }
        if (this.lightningState >= 0) {
            if (this.world.isRemote) {
                this.world.setLastLightningBolt(2);
            } else if (!this.effectOnly) {
                List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this,
                        new AxisAlignedBB(this.posX - 3.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 3.0D,
                                this.posY + 6.0D + 3.0D, this.posZ + 3.0D));

                for (Entity entity : list) {
                    if (!net.minecraftforge.event.ForgeEventFactory.onEntityStruckByLightning(entity, this) &&
                            !(entity instanceof EntityPlayer) && !(entity instanceof EntityItem))
                        entity.onStruckByLightning(this);
                }
            }
        }
    }
}
