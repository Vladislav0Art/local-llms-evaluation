package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testTextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", splitTextNode.text());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, null);
        } catch (IOException e) {
            fail("Exception should not be thrown");
        }
        assertEquals("test", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            fail("Exception should not be thrown");
        }
        assertEquals("", accum.toString());
    }

}