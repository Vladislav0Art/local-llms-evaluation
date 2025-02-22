package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestIsBlankWithEmptyString {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testIsBlankWithEmptyString() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}