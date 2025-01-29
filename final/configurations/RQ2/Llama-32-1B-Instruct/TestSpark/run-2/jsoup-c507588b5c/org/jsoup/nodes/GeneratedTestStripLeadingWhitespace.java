package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        StringBuilder sb = new StringBuilder("Hello");
        assertEquals("Hello", stripLeadingWhitespace(sb));
    }

}