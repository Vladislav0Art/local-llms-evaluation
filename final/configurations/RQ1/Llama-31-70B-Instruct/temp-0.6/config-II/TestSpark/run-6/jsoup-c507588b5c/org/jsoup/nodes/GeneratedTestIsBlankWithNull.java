package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestIsBlankWithNull {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testIsBlankWithNull() {
        textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

}