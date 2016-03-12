package jamp.nineth.util;

import java.util.HashMap;

/**
 * Utility class for String
 * @author Yevgeniy Popov
 */
public final class StringUtil {

    /**
     * Method returns reversed string
     * @param source string for checking
     * @return reversed string
     */
    public static String getReverseString(String source) {
        if (isEmpty(source)) {
            throw new IllegalArgumentException("Argument is empty or null.");
        }
        return new StringBuilder(source).reverse().toString();
    }

    /**
     * Method checks string for emptiness
     * @param str string for checking
     * @return empty flag
     */
    public static boolean isEmpty(String str) {
        return !(str != null && str.length() > 0);
    }

//    public static void aaa(String a) {
//        HashMap hashMap = new HashMap();
//        hashMap.put("AAA", 1);
//        hashMap.put(1, 2);
//    }
}
