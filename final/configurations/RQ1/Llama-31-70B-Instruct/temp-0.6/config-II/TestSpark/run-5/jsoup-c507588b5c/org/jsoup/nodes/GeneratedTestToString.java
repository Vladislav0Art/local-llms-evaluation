package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestToString {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode();
    }

    @Test
    public void testToString() {
        textNode.text("some text");
        assertEquals("some text", textNode.toString());
    }

}