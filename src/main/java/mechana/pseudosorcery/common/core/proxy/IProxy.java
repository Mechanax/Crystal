package mechana.pseudosorcery.common.core.proxy;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
