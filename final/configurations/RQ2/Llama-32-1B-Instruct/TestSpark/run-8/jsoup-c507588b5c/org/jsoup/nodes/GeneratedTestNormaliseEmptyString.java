package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestNormaliseEmptyString {

    @Test
    public void testNormaliseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, normaliseWhitespace(input));
    }

    private String normaliseWhitespace(String text) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < text.length()) {
            if (text.charAt(i).isspace()) {
                if (sb.length() > 0) {
                    sb.append(text.charAt(i));
                }
            } else {
                break;
            }
            ++i;
        }
        return sb.toString();
    }

}