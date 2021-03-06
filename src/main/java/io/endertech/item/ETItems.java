package io.endertech.item;

import cpw.mods.fml.common.registry.GameRegistry;
import io.endertech.reference.Strings;
import net.minecraft.item.ItemStack;

public class ETItems
{
    public static ItemExchanger itemExchanger;
    public static ItemStack toolExchangerCreative;
    public static ItemStack toolExchangerRedstone;
    public static ItemStack toolExchangerResonant;

    public static void init()
    {
        itemExchanger = (ItemExchanger) new ItemExchanger().setUnlocalizedName(Strings.EXCHANGER_BASE);

        GameRegistry.registerItem(itemExchanger, "endertech." + Strings.EXCHANGER_BASE);

        loadItems();
    }

    public static void loadItems()
    {
        toolExchangerCreative = itemExchanger.addItem(ItemExchanger.Types.CREATIVE.ordinal(), Strings.EXCHANGER_CREATIVE);
        toolExchangerRedstone = itemExchanger.addItem(ItemExchanger.Types.REDSTONE.ordinal(), Strings.EXCHANGER_REDSTONE);
        toolExchangerResonant = itemExchanger.addItem(ItemExchanger.Types.RESONANT.ordinal(), Strings.EXCHANGER_RESONANT);
    }
}
