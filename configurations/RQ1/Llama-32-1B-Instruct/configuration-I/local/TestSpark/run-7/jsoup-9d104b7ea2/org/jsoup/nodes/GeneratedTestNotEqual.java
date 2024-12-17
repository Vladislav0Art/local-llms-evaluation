package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNotEqual {

    @Test
    public void testNotEqual() {
        String result1 = stripLeadingWhitespace(new StringBuilder("Goodbye\nWorld"));
        String result2 = stripLeadingWhitespace(new StringBuilder("\nGoodbye\nWorld"));
        assertEquals(result1, "Goodbye");
        assertEquals(result2, "Goodbye");
    }

}