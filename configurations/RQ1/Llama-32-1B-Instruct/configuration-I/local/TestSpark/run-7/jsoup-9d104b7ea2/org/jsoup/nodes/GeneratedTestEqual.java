package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEqual {

    @Test
    public void testEqual() {
        String result1 = stripLeadingWhitespace(new StringBuilder("Hello\nWorld"));
        String result2 = stripLeadingWhitespace(new StringBuilder("\nWorld\nHello"));
        assertEquals(result1, "World");
        assertEquals(result2, "World");
    }

}