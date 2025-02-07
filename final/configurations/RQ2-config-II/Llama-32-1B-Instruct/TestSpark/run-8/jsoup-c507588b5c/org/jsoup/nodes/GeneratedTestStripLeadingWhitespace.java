package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestStripLeadingWhitespace {

    private TextNode rootNode;

    @Test
    public void testStripLeadingWhitespace() {
        String text = stripLeadingWhitespace("   Hello   World  ");
        assertEquals("Hello World", text);
    }

}