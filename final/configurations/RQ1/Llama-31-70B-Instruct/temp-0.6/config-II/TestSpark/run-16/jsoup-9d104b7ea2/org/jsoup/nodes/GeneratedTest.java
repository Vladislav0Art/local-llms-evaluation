package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   Hello World!   ");
        assertEquals("Hello World!", textNode.text());
    }

    @Test
    public void textWithNullTest() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void textWithEmptyStringTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("   Hello World!   ");
        assertEquals("   Hello World!   ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankWithNullTest() {
        TextNode textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

}