package com.conventnunnery.plugins.conventlib.utils;

import org.bukkit.Material;

public final class ItemStackUtils {

    private ItemStackUtils() {
    }

    /**
     * Returns a durability value that is acceptable for a specified Material, based on whether or not the specified
     * durability value is less than 0 and is greater than the Material's maximum durability.
     * @param material Material to check
     * @param durability Durability to check
     * @return 0 if durability is less than 0 and Material's maximum durability if durability is larger than maximum
     */
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

    /**
     * Returns a durability value for a Material, where the value returned is between the Material's maximum
     * durability multiplied by minDurability and maxDurability.
     * @param material Material to check
     * @param minDurability Lowest percentage for durability
     * @param maxDurability Highest percentage for durability
     * @return durability value for Material
     */
    public static short getDurabilityForMaterial(Material material, double minDurability, double maxDurability) {
        short minimumDurability = (short) (material.getMaxDurability() - material.getMaxDurability() * Math.max
                (minDurability, maxDurability
                ));
        short maximumDurability = (short) (material.getMaxDurability() - material.getMaxDurability() * Math.min
                (minDurability, maxDurability));
        return (short) RandomUtils.randomRangeWholeInclusive(minimumDurability, maximumDurability);
    }
}
