package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextSetter {

    @Test
    public void testTextSetter() {
        TextNode node = new TextNode("Test text");
        node.text("New text");
        assertEquals("New text", node.coreValue());
    }

}