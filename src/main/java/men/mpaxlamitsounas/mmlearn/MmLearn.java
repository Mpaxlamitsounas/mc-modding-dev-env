package men.mpaxlamitsounas.mmlearn;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import men.mpaxlamitsounas.mmlearn.proxy.CommonProxy;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class MmLearn {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @SidedProxy(clientSide = "men.mpaxlamitsounas.mmlearn.proxy.ClientProxy",
                serverSide = "men.mpaxlamitsounas.mmlearn.proxy.ServerProxy")
    public static CommonProxy proxy;

    static {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        LOGGER.info("Hello from " + Tags.MODNAME + "!");
        proxy.preInit(e);
    }
}
