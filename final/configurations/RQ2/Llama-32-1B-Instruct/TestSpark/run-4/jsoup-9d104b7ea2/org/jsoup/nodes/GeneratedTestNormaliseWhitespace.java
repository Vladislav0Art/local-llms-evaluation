package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello   World  ";
        String normalisedText = normalizeWhitespace(text);
        assertEquals("Hello World", normalisedText);
    }

}