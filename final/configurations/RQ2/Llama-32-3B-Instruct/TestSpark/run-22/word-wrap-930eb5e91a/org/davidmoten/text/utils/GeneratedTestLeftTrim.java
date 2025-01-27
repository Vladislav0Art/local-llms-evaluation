package org.davidmoten.text.utils;

public class GeneratedTestLeftTrim {

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
    public void testLeftTrim() {
        String original = "   Hello World!";
        StringBuilder trimmed = WordWrap.leftTrim(original);
        assertEquals("Hello World!", trimmed.toString());
    }

}