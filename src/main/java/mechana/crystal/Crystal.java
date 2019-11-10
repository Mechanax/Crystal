package mechana.crystal;

import mechana.crystal.common.lib.LibMisc;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(LibMisc.MOD_ID)
public class Crystal {

    public static Crystal instance;

    public static final Logger LOG = LogManager.getLogger(LibMisc.MOD_ID);

    public Crystal() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOG.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event){
        LOG.info("clientRegistries method registered.");
    }
}
