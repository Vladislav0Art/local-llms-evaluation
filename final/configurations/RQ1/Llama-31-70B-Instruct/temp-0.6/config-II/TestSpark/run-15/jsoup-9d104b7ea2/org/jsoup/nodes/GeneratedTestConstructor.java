package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        TextNode node = new TextNode("Test text");
        assertEquals("Test text", node.coreValue());
    }

}