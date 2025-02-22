package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void testToString() {
        assertEquals("This is a text node", textNode.toString());
    }

}