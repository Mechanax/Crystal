package mechana.pseudosorcery.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockRakedSandCorner extends Block {

    public BlockRakedSandCorner() {
        super(Properties.create(Material.SAND)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.SAND)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
        );
        setRegistryName("raked_sand_corner");
    }
}
