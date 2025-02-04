package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedText_GivenTextNodeWithWhitespaceAtEnd_ReturnsNormalizedTextWithTrailingSpacesRemoved {

    @Test
    public void text_GivenTextNodeWithWhitespaceAtEnd_ReturnsNormalizedTextWithTrailingSpacesRemoved() {
        TextNode textNode = new TextNode("   Hello World  ");
        String result = textNode.text();
        assertNotNull(result);
        assertTrue(!result.contains("\n"));
        assertEquals("text", textNode.nodeName());
    }

}