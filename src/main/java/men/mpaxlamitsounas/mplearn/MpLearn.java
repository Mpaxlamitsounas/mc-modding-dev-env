package men.mpaxlamitsounas.mplearn;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import men.mpaxlamitsounas.mplearn.proxy.CommonProxy;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class MpLearn {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @SidedProxy(clientSide = "men.mpaxlamitsounas.mplearn.proxy.ClientProxy",
                serverSide = "men.mpaxlamitsounas.mplearn.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        LOGGER.info("I am " + Tags.MODNAME + " + at version " + Tags.VERSION);
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }
}
