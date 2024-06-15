package men.mpaxlamitsounas.mmlearn.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import men.mpaxlamitsounas.mmlearn.ModBlocks;
import men.mpaxlamitsounas.mmlearn.ModItems;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModBlocks.initModels();
        ModItems.initModels();
    }

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ModBlocks.renderFluidBlocks();
    }
}
