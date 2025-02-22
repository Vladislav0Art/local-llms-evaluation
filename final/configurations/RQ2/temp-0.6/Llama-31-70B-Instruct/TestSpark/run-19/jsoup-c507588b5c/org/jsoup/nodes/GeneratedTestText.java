package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testText() {
        assertEquals("Some text", textNode.text());
    }

}