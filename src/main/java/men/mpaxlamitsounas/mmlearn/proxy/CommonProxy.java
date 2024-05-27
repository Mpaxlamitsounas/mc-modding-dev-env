package men.mpaxlamitsounas.mmlearn.proxy;

import men.mpaxlamitsounas.mmlearn.fluids.Piss;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.capability.wrappers.FluidBlockWrapper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import men.mpaxlamitsounas.mmlearn.ModBlocks;
import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Shit;
import men.mpaxlamitsounas.mmlearn.items.MSword;
import men.mpaxlamitsounas.mmlearn.items.Turd;
import men.mpaxlamitsounas.mmlearn.fluids.Piss;

@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new CastleRoofTile(),
                new Shit());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(ModBlocks.castleRoofTile).setRegistryName(ModBlocks.castleRoofTile.getRegistryName()),
                new MSword(),
                new Turd(),
                new ItemBlock(ModBlocks.shit).setRegistryName(ModBlocks.shit.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerFluids(RegistryEvent.Register<Item> event) {
        FluidRegistry.registerFluid(new Piss());
    }

    public void preInit(FMLPreInitializationEvent e) {}

    public void init(FMLInitializationEvent e) {}
}
