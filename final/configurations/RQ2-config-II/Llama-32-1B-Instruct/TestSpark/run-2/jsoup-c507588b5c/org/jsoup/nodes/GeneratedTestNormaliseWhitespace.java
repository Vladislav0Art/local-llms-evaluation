package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String originalText = "   Hello   World  ";
        String normalizedText = TextNode.normaliseWhitespace(originalText);
        assertEquals("Hello World", normalizedText);
    }

}