package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlankTest {

    private TextNode textNode;

    @Before
    public void before() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void isBlankTest() {
        assertEquals(false, textNode.isBlank());
    }

}