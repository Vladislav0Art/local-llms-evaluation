package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("Test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("  Test  ");
        assertEquals("Test", node.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("  Test  ");
        assertEquals("  Test  ", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("  ");
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Test");
        TextNode splitNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, null);
        assertEquals("Test", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.toString());
    }

}