package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("some text");
        String nodeName = textNode.nodeName();
        assertEquals("#text", nodeName);
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("some text");
        String text = textNode.text();
        assertEquals("some text", text);
    }

    @Test
    public void testText_set() {
        TextNode textNode = new TextNode("some text");
        textNode.text("new text");
        String text = textNode.text();
        assertEquals("new text", text);
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("some text");
        String wholeText = textNode.getWholeText();
        assertEquals("some text", wholeText);
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        boolean isBlank = textNode.isBlank();
        assertTrue(isBlank);
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("some text");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("some", textNode.text());
        assertEquals(" text", splitNode.text());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("some text");
        // TODO: Implement outerHtmlHead test
    }

    @Test
    public void testOuterHtmlTail() {
        TextNode textNode = new TextNode("some text");
        // TODO: Implement outerHtmlTail test
    }

}