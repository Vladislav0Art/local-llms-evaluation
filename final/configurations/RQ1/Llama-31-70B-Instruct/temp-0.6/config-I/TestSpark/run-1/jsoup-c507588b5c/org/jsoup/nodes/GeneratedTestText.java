package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void testText() {
        assertEquals("This is a text node", textNode.text());
        textNode.text("This is a new text node");
        assertEquals("This is a new text node", textNode.text());
    }

}