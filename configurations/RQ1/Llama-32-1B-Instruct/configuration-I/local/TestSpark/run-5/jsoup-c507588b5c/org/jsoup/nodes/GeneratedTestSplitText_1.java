package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_1 {

    public static String normalizeWhitespace(String text) {
        return text.trim();
    }

    public static StringBuilder stripLeadingWhitespace(StringBuilder sb) {
        if (sb == null || sb.length() == 0) {
            return new StringBuilder();
        }
        int index = sb.indexOfFirst(" ");
        if (index != -1) {
            return sb.substring(index + 1);
        } else {
            return sb.toString();
        }
    }

    @Test
    public void testSplitText_1() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        String result = normalizeWhitespace(node.getText());
        assertEquals("Hello World!", result);
    }

}