package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedCreateTextNodeBlank_GivenBlankText_ReturnsTextNodeWithBlankValue {

    @Test
    public void createTextNodeBlank_GivenBlankText_ReturnsTextNodeWithBlankValue() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("text", textNode.nodeName());
        assertTrue(textNode.isBlank());
    }

}