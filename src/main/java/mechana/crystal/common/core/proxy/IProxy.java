package mechana.crystal.common.core.proxy;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
