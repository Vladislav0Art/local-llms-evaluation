package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;

public class GeneratedText_GivenBlankTextNode_ReturnsBlankString {

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        String result = textNode.text();
        assertNotNull(result);
        assertTrue(result.isEmpty());
        assertEquals("text", textNode.nodeName());
    }

}