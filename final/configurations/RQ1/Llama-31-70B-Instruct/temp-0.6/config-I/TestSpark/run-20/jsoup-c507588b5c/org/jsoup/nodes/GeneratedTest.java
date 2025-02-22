package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void before() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        assertEquals("This is a text node", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        assertEquals("This is a text node", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode2 = textNode.splitText(5);
        assertEquals("This ", textNode.getWholeText());
        assertEquals("is a text node", textNode2.getWholeText());
    }

}