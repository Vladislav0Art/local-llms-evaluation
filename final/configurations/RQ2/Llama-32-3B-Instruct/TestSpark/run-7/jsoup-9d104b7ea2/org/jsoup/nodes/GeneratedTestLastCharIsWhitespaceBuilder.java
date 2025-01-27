package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespaceBuilder {

    public static String normaliseWhitespace(String input) {
        return input.replaceAll("\\s", " ");
    }

    public static String stripLeadingWhitespace(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        while (!input.isEmpty() && Character.isWhitespace(input.charAt(0))) {
            input = input.substring(1);
        }
        return input;
    }

    public static boolean lastCharIsWhitespace(StringBuilder builder) {
        return !builder.toString().isEmpty() && Character.isWhitespace(builder.charAt(builder.length() - 1));
    }

    public static String[] splitOnComma(String input) {
        return input.isEmpty() ? new String[0] : input.split(",");
    }
}

public class TextTest {

    @Test
    public void testLastCharIsWhitespaceBuilder() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                builder.append(' ');
            } else {
                builder.append('a');
            }
        }
        assertTrue(StringUtil.lastCharIsWhitespace(builder));
    }

}