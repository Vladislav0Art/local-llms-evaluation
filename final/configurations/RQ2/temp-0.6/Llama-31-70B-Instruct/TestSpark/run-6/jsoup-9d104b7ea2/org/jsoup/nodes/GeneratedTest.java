package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

    @Test
    public void textNodeOuterHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("test", accum.toString());
    }

}