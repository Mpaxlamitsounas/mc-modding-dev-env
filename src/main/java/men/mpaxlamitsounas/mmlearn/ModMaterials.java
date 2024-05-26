package men.mpaxlamitsounas.mmlearn;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {

    // TODO: figure out why it doesn't appear in JEI
    public static final Item.ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("materialObsidian", 4, 2000, 12.0F,
            10.0F - 4.0F, 100).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.OBSIDIAN)));
}
