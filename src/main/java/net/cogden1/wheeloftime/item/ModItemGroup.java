package net.cogden1.wheeloftime.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup WHEELOFTIME_GROUP = new ItemGroup("wheelOfTimeTab") {

        @Override

        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.TESLANIUM.get());
        }

    };
}
