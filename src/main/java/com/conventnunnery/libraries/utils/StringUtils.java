package com.conventnunnery.libraries.utils;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StringUtils {

    private StringUtils() {
    }

    /**
     * Returns a String where every word in the String is capitalized.
     *
     * @param args words that make up the future String
     * @return capitalized String
     */
    public static String getInitCappedString(String... args) {
        Joiner joiner = Joiner.on(" ").skipNulls();
        joiner.join(args);
        List<String> strings = Arrays.asList(args);
        List<String> initCappedList = new ArrayList<String>();
        for (String s : strings) {
            initCappedList.add(capitalize(s));
        }
        return initCappedList.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    /**
     * Capitalizes a String.
     *
     * @param param String to capitalize
     * @return capitalized String
     */
    public static String capitalize(String param) {
        if (param != null && param.length() > 0) {
            char[] charArray = param.toCharArray(); // convert into char array
            charArray[0] = Character.toUpperCase(charArray[0]); // set capital letter to first postion
            return new String(charArray); // return desired output
        } else {
            return "";
        }
    }

    public static String initCap(String string) {
        if (Strings.isNullOrEmpty(string)) {
            return "";
        }
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
