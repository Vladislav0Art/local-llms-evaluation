package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

}