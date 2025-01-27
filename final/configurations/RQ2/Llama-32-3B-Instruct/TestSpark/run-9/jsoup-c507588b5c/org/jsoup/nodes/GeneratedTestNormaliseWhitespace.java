package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    public static String normaliseWhitespace(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    public static String stripLeadingWhitespace(String input) {
        int start = 0;
        while (start < input.length() && Character.isWhitespace(input.charAt(start))) {
            start++;
        }
        if (start == input.length()) {
            return "";
        }
        return input.substring(start);
    }

    public static String cloneText(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

public class GeneratedTest {

    @Test
    public void testNormaliseWhitespace() {
        String input = "   Hello, World!";
        String expected = Main.normaliseWhitespace(input);
        assertEquals(expected, "Hello, World!");
    }

}