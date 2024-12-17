package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEmpty {

    @Test
    public void testEmpty() {
        String str = "";
        assertEquals("Hello", stripLeadingWhitespace(new StringBuilder(str)));
        assertEquals("", stripLeadingWhitespace(new StringBuilder""));
    }

    private String stripLeadingWhitespace(StringBuilder sb) {
        while (!sb.isEmpty() && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

}