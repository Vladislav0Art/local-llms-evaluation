package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.text("New text");
        assertEquals("New text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello world!");
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Hello", textNode.text());
        assertEquals(" world!", splitTextNode.text());
    }

    @Test
    public void splitTextBoundsTest() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.splitText(-1);
    }

}