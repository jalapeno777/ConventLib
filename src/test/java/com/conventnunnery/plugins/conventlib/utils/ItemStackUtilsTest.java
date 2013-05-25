package com.conventnunnery.plugins.conventlib.utils;

import junit.framework.Assert;
import org.bukkit.Material;
import org.junit.Test;

public class ItemStackUtilsTest {
    @Test
    public void testGetAcceptableDurability() throws Exception {
        Material material = Material.GOLD_PICKAXE;
        double value1 = 0.1;
        double value2 = 1.0;
        short durability = ItemStackUtils.getDurabilityForMaterial(material, value1, value2);

        Assert.assertNotNull(material);
        Assert.assertNotNull(durability);
        Assert.assertTrue(durability >= (material.getMaxDurability() - (material.getMaxDurability() - Math.max
                (value1,value2))));
        Assert.assertTrue(
                durability <= (material.getMaxDurability() - (material.getMaxDurability() * Math.min(value1, value2))));
    }

    @Test
    public void testGetDurabilityForMaterial() throws Exception {
        Material material = Material.GOLD_PICKAXE;
        double value1 = 0.1;
        double value2 = 0.2;
        short durability = ItemStackUtils
                .getDurabilityForMaterial(material, value1,
                        value2);
        short minimumDurability = (short) (material.getMaxDurability() - (material.getMaxDurability() * Math.max
                (value1, value2)));
        short maximumDurability = (short) (material.getMaxDurability() - (material.getMaxDurability() * Math.min
                (value1, value2)));

        System.out.println("Material max durability: " + material.getMaxDurability());
        System.out.println("Randomly generated durability: " + durability);
        System.out.println("Minimum durability: " + minimumDurability);
        System.out.println("Maximum durability: " + maximumDurability);

        Assert.assertNotNull(material);
        Assert.assertNotNull(value1);
        Assert.assertNotNull(value2);
        Assert.assertNotNull(durability);
        Assert.assertTrue(durability >= minimumDurability);
        Assert.assertTrue(durability <= maximumDurability);
    }
}
