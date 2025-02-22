package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        String nodeName = textNode.nodeName();
        assertEquals("#text", nodeName);
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        String text = textNode.text();
        assertEquals("test", text);
    }

    @Test
    public void testText2() {
        String text = "test";
        TextNode textNode = new TextNode(text);
        textNode.text(text);
        String newText = textNode.text();
        assertEquals(text, newText);
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        String wholeText = textNode.getWholeText();
        assertEquals("test", wholeText);
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode(" ");
        boolean isBlank = textNode.isBlank();
        assertTrue(isBlank);
    }

    @Test
    public void testIsBlank2() {
        TextNode textNode = new TextNode("test");
        boolean isBlank = textNode.isBlank();
        assertFalse(isBlank);
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitText = textNode.splitText(1);
        assertEquals("t", textNode.coreValue());
        assertEquals("est", splitText.coreValue());
    }

}