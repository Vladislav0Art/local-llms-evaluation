package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("st", splitTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, null);
        } catch (IOException e) {
            fail("Exception thrown");
        }
        assertEquals("test", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            fail("Exception thrown");
        }

    }