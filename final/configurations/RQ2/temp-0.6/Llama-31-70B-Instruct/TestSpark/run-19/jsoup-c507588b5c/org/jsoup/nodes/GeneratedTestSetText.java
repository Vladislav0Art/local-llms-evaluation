package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSetText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testSetText() {
        textNode.text("New text");
        assertEquals("New text", textNode.text());
    }

}