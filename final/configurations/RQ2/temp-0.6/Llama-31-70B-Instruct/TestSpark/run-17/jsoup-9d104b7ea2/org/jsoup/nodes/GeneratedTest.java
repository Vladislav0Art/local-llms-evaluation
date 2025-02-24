package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test text");
        assertNotNull(textNode);
    }

    @Test
    public void textNodeConstructorNullTest() {
        TextNode textNode = new TextNode(null);
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
    }

    @Test
    public void textNullTest() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void textSetterNullTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
        textNode.text(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.getWholeText());
    }

    @Test
    public void getWholeTextNullTest() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.getWholeText());
    }

}