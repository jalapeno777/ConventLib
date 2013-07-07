package com.conventnunnery.libraries.utils;

import org.bukkit.ChatColor;

public class ChatColorUtils {
    public static ChatColor getChatColorOrFallback(String string, ChatColor fallback) {
        ChatColor chatColor;
        try {
            chatColor = ChatColor.valueOf(string);
        } catch (IllegalArgumentException exception) {
            chatColor = fallback;
        }
        return chatColor;
    }
}
