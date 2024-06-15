package men.mpaxlamitsounas.mmlearn.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import men.mpaxlamitsounas.mmlearn.ModBlocks;
import men.mpaxlamitsounas.mmlearn.ModItems;
import men.mpaxlamitsounas.mmlearn.fluids.CustomFluid;

@Mod.EventBusSubscriber
public class CommonProxy {

    public static void registerFluid(CustomFluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                ModBlocks.castleRoofTile,
                ModBlocks.mud);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ModBlocks.asItemBlock(ModBlocks.castleRoofTile),
                ModItems.mSword,
                ModItems.mudball,
                ModBlocks.asItemBlock(ModBlocks.mud));
    }

    @SubscribeEvent
    public void preInit(FMLPreInitializationEvent e) {}
}
