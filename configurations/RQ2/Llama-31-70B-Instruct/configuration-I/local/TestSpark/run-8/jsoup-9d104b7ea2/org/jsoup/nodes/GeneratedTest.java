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
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
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
    public void testToString() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode cloneTextNode = textNode.clone();
        assertEquals("test", cloneTextNode.text());
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("&lt;");
        assertEquals("<", textNode.text());
    }

}