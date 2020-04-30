package mechana.pseudosorcery.common.core;

import mechana.pseudosorcery.common.block.ModBlocks;
import mechana.pseudosorcery.common.lib.LibMisc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup(LibMisc.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.RAKEDSAND);
        }
    };

    public void init() {

    }
}
