package com.conventnunnery.libraries.utils;

import junit.framework.Assert;
import org.bukkit.ChatColor;
import org.junit.Test;

public class ChatColorUtilsTest {
    @Test
    public void testGetChatColorOrFallbackPositive() throws Exception {
        ChatColor value1 = ChatColor.BLACK;
        ChatColor value2;
        String string1 = "BLACK";

        value2 = ChatColorUtils.getChatColorOrFallback(string1, value1);

        Assert.assertNotNull(value2);

        Assert.assertEquals(value1, value2);
    }

    @Test
    public void testGetChatColorOrFallbackNegative() throws Exception {
        ChatColor value1 = ChatColor.BLACK;
        ChatColor value2;
        String string1 = "PURPLE";

        value2 = ChatColorUtils.getChatColorOrFallback(string1, value1);

        Assert.assertNotNull(value2);

        Assert.assertEquals(value1, value2);
    }
}
