package mechana.crystal.client.core.proxy;

import mechana.crystal.common.core.proxy.IProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
