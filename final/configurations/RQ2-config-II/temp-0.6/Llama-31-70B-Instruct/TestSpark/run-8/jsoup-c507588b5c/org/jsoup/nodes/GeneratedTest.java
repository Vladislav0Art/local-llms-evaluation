package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("");
        String expected = "#text";
        String actual = textNode.nodeName();
        assertEquals(expected, actual);
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("This is a test");
        String expected = "This is a test";
        String actual = textNode.text();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("This is a test");
        String expected = "This is a test";
        String actual = textNode.getWholeText();
        assertEquals(expected, actual);
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("This is a test");
        TextNode actual = textNode.splitText(1);
        assertEquals("T", textNode.getWholeText());
        assertEquals("his is a test", actual.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("This is a test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("This is a test", accum.toString());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("This is a test");
        String expected = "This is a test";
        String actual = textNode.toString();
        assertEquals(expected, actual);
    }

}