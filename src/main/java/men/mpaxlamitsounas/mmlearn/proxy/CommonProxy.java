package men.mpaxlamitsounas.mmlearn.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import men.mpaxlamitsounas.mmlearn.ModBlocks;
import men.mpaxlamitsounas.mmlearn.blocks.CastleRoofTile;
import men.mpaxlamitsounas.mmlearn.blocks.Mud;
import men.mpaxlamitsounas.mmlearn.items.MSword;
import men.mpaxlamitsounas.mmlearn.items.Mudball;

@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new CastleRoofTile(),
                new Mud(),
                ModBlocks.LEMONADE_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(ModBlocks.castleRoofTile).setRegistryName(ModBlocks.castleRoofTile.getRegistryName()),
                new MSword(),
                new Mudball(),
                new ItemBlock(ModBlocks.mud).setRegistryName(ModBlocks.mud.getRegistryName()));
    }

    public void preInit(FMLPreInitializationEvent e) {}

    public void init(FMLInitializationEvent e) {}
}
