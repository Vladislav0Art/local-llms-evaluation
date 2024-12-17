package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testEmptyString() {
        String result1 = stripLeadingWhitespace(new StringBuilder(""));
        String result2 = stripLeadingWhitespace(new StringBuilder("Hello"));
        assertEquals(result1, "");
        assertEquals(result2, "Hello");
    }

    private String stripLeadingWhitespace(StringBuilder sb) {
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

}