package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestToString {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("hello world");
    }

    @Test
    public void testToString() {
        assertEquals("hello world", textNode.toString());
    }

}