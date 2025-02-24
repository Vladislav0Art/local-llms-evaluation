package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("text");
        assertNotNull(textNode);
    }

    @Test
    public void textNodeConstructorNegativeTest() {
        TextNode textNode = new TextNode(null);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("some other text");
        assertEquals("some other text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("text", textNode.text());
        assertEquals("xt", splitNode.text());
    }

}