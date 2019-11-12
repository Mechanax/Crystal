package mechana.crystal;

import mechana.crystal.client.core.proxy.ClientProxy;
import mechana.crystal.common.block.FirstBlock;
import mechana.crystal.common.block.ModBlocks;
import mechana.crystal.common.core.proxy.IProxy;
import mechana.crystal.common.core.proxy.ServerProxy;
import mechana.crystal.common.lib.LibMisc;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(LibMisc.MOD_ID)
public class Crystal {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static Crystal instance;

    public static final Logger LOG = LogManager.getLogger(LibMisc.MOD_ID);

    public Crystal() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOG.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event){
        LOG.info("clientRegistries method registered.");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new FirstBlock());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, new Item.Properties()).setRegistryName("firstblock"));
        }
    }
}
