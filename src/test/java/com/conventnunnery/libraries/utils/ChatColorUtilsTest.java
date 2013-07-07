package com.conventnunnery.libraries.utils;

import junit.framework.Assert;
import org.bukkit.ChatColor;
import org.junit.Test;

public class ChatColorUtilsTest {
    @Test
    public void testGetChatColorOrFallback() throws Exception {
        ChatColor value1 = ChatColor.BLACK;
        ChatColor value2;
        ChatColor value3;
        ChatColor value4 = ChatColor.AQUA;
        String string1 = "PURPLE";
        String string2 = "BLACK";

        value2 = ChatColorUtils.getChatColorOrFallback(string1, value1);
        value3 = ChatColorUtils.getChatColorOrFallback(string2, value4);

        Assert.assertNotNull(value2);
        Assert.assertNotNull(value3);

        Assert.assertEquals(value1, value2);
        Assert.assertEquals(value1, value3);
    }
}
