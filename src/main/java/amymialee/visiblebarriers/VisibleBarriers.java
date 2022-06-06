package amymialee.visiblebarriers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class VisibleBarriers implements ModInitializer {
    public final static String MOD_ID = "visiblebarriers";
    protected static boolean visible = false;
    protected static boolean visibleAir = false;

    @Override
    public void onInitialize() {}

    public static boolean isVisible() {
        return visible;
    }

    public static boolean isVisibleAir() {
        return visibleAir;
    }
}
