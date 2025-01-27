package org.davidmoten.text.utils;

public class GeneratedTestLeftTrimEmpty {

    public static StringBuilder leftTrim(String original) {
        return new StringBuilder(original);
    }

    public static StringBuilder rightTrim(String original) {
        int length = original.length();
        char[] chars = original.toCharArray();
        for (int i = 0; i < length; ++i) {
            if (!Character.isWhitespace(chars[i])) {
                break;
            }
        }
        return new StringBuilder(original.substring(i));
    }

    public static boolean isWhitespace(String input) {
        return input.isEmpty() || input.trim().isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testLeftTrimEmpty() {
        String original = "";
        StringBuilder trimmed = WordWrap.leftTrim(original);
        assertEquals("", trimmed.toString());
    }

}