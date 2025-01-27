package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitText_SplitAtOneChar_ReturnsNewTextNode {

    @Test
    public void splitText_SplitAtOneChar_ReturnsNewTextNode() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result = node.splitText(0);
        assertNotNull(result);
        assertEquals(2, result.nodes().size());
        assertEquals("Hello", result.text());
        assertEquals("World", result.nodes().get(1).text());
    }

}