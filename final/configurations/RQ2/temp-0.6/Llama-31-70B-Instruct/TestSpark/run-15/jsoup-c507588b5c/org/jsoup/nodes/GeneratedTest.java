package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("Text");
        assertFalse(textNode.isBlank());

        textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("  ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Text");
        TextNode newTextNode = textNode.splitText(2);

        assertEquals("Te", textNode.getWholeText());
        assertEquals("xt", newTextNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());

        assertEquals("Text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());

        assertEquals("", accum.toString());
    }

}