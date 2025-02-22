package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createFromEncoded() {
        String encodedText = "&amp;lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expectedText = "&lt;";
        assertEquals(expectedText, textNode.text());
    }

    @Test
    public void isBlank() {
        TextNode textNode = new TextNode("   \n");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isNotBlank() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText() {
        TextNode textNode = new TextNode("Hello world");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Hello", textNode.text());
        assertEquals(" world", splitNode.text());
    }

    @Test
    public void outerHtmlHead() {
        TextNode textNode = new TextNode("Hello world");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        String expected = "Hello world";
        assertEquals(expected, accum.toString());
    }

    @Test
    public void outerHtmlTail() {
        TextNode textNode = new TextNode("Hello world");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

    @Test
    public void normaliseWhitespace() {
        String text = "  Hello  world  ";
        String expectedText = "Hello world";
        assertEquals(expectedText, TextNode.normaliseWhitespace(text));
    }

}