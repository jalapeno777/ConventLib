package com.conventnunnery.plugins.conventlib.utils;

import org.bukkit.Material;

public final class ItemStackUtils {
    private ItemStackUtils() {

    }
    public static short getAcceptableDurability(Material material, short durability) {
        short dura = durability;
        if (dura > material.getMaxDurability()) {
            dura = material.getMaxDurability();
        }
        if (dura < 0) {
            dura = 0;
        }
        return dura;
    }

    public static short getDurabilityForMaterial(Material material, double minDurability, double maxDurability) {
        short minimumDurability = (short) (material.getMaxDurability() - (material.getMaxDurability() * Math.max
                (minDurability, maxDurability)
        ));
        short maximumDurability = (short) (material.getMaxDurability() - (material.getMaxDurability() * Math.min
                (minDurability, maxDurability)
        ));
        return (short) RandomUtils.randomRangeWholeInclusive(minimumDurability, maximumDurability);
    }
}
