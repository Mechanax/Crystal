package mechana.pseudosorcery.common.items;

import mechana.pseudosorcery.PseudoSorcery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SandRakeItem extends Item {

    public SandRakeItem() {
        super(new Item.Properties()
                .maxDamage(500)
                .setNoRepair()
                .group(PseudoSorcery.setup.itemGroup));
        setRegistryName("sand_rake");
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack container = stack.copy();
        if (container.attemptDamageItem(1, new Random(), null)) {
            return ItemStack.EMPTY;
        } else {
            return container;
        }
    }
}
