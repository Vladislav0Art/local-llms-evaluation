package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNode {

    @Test
    public void testTextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}