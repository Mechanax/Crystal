package mechana.pseudosorcery.common.core;

import mechana.pseudosorcery.common.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static mechana.pseudosorcery.common.lib.LibMisc.MOD_ID;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init() {

    }
}
