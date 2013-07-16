package com.conventnunnery.libraries.utils;

import org.bukkit.ChatColor;

public final class ChatColorUtils {

    private ChatColorUtils() {
    }

    public static ChatColor getChatColorOrFallback(String string, ChatColor fallback) {
        String name = string;
        if (name == null) {
            name = fallback.name();
        }
        ChatColor chatColor;
        try {
            chatColor = ChatColor.valueOf(name);
        } catch (IllegalArgumentException exception) {
            chatColor = fallback;
        }
        return chatColor;
    }
}
