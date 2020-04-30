package mechana.pseudosorcery.common.items;

import mechana.pseudosorcery.common.lib.LibMisc;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LibMisc.MOD_ID)
public class ModItems {
    @ObjectHolder("sand_rake") public static Item SANDRAKE;
}
