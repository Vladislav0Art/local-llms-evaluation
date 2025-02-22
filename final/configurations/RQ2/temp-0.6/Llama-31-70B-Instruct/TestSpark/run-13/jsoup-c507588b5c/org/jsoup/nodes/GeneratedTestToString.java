package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testToString() {
        assertEquals("text", textNode.toString());
    }

}