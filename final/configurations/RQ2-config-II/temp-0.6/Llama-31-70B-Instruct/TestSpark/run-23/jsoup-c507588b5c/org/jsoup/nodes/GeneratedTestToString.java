package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("Hello World!");
        assertEquals("Hello World!", textNode.toString());
    }

}