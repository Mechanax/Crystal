package mechana.pseudosorcery;

import mechana.pseudosorcery.client.core.proxy.ClientProxy;
import mechana.pseudosorcery.common.block.BlockRakedSand;
import mechana.pseudosorcery.common.block.BlockRakedSandCorner;
import mechana.pseudosorcery.common.block.ModBlocks;
import mechana.pseudosorcery.common.core.ModSetup;
import mechana.pseudosorcery.common.core.proxy.IProxy;
import mechana.pseudosorcery.common.core.proxy.ServerProxy;
import mechana.pseudosorcery.common.items.ModItems;
import mechana.pseudosorcery.common.items.SandRakeItem;
import mechana.pseudosorcery.common.lib.LibMisc;
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
public class PseudoSorcery {

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public static ModSetup setup = new ModSetup();

    public static final Logger LOG = LogManager.getLogger(LibMisc.MOD_ID);

    public static PseudoSorcery instance;

    public PseudoSorcery() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
        LOG.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event){
        LOG.info("clientRegistries method registered.");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BlockRakedSand());
            //event.getRegistry().register(new BlockRakedSandCorner());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.RAKEDSAND, properties).setRegistryName("raked_sand"));
            //event.getRegistry().register(new BlockItem(ModBlocks.RAKEDSANDCORNER, properties).setRegistryName("raked_sand_corner"));
            event.getRegistry().register(new SandRakeItem());
        }
    }
}
