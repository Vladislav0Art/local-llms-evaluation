package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestNormaliseWhitespace {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode();
    }

    @Test
    public void testNormaliseWhitespace() {
        assertEquals("some text", TextNode.normaliseWhitespace(" some   text "));
    }

}