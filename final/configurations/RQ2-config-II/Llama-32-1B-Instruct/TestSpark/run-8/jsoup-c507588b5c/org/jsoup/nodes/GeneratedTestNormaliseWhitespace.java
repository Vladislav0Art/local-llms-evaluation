package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNormaliseWhitespace {

    private TextNode rootNode;

    @Test
    public void testNormaliseWhitespace() {
        String text = normaliseWhitespace("   Hello   World  ");
        assertEquals("Hello World", text);
    }

}