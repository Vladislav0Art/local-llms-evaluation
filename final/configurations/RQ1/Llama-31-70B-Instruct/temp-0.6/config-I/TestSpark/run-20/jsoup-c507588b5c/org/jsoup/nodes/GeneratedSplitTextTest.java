package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitTextTest {

    private TextNode textNode;

    @Before
    public void before() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void splitTextTest() {
        TextNode textNode2 = textNode.splitText(5);
        assertEquals("This ", textNode.getWholeText());
        assertEquals("is a text node", textNode2.getWholeText());
    }

}