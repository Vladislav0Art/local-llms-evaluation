package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTextTest {

    private TextNode textNode;

    @Before
    public void before() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void textTest() {
        assertEquals("This is a text node", textNode.text());
    }

}