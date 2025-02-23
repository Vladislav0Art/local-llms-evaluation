package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.coreValue());
    }

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
        textNode.text("new test");
        assertEquals("new test", textNode.text());
    }

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
        textNode.text(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.coreValue());
        assertEquals("st", splitTextNode.coreValue());
    }

    @Test
    public void textNodeOuterHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("test", accum.toString());
    }

    @Test
    public void textNodeToStringTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

}