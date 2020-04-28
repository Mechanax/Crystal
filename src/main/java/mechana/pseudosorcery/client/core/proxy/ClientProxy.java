package mechana.pseudosorcery.client.core.proxy;

import mechana.pseudosorcery.common.core.proxy.IProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
