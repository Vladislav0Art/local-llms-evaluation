package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("  text  ");
        assertEquals("text", node.text());
    }

}