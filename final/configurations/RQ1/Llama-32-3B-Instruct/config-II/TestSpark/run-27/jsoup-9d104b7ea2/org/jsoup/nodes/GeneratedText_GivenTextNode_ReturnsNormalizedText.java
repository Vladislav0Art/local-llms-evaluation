package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedText_GivenTextNode_ReturnsNormalizedText {

    @Test
    public void text_GivenTextNode_ReturnsNormalizedText() {
        TextNode textNode = new TextNode("   Hello   World  ");
        String result = textNode.text();
        assertNotNull(result);
        assertTrue(result.contains("\n"));
        assertEquals("text", textNode.nodeName());
    }

}