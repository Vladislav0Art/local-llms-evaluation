package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testCreateFromEncoded() {
        TextNode node = TextNode.createFromEncoded("&lt;");
        assertEquals("<", node.coreValue());
    }

    @Test
    public void testConstructor() {
        TextNode node = new TextNode("Test text");
        assertEquals("Test text", node.coreValue());
    }

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("Test text");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode(" Test   text ");
        assertEquals("Test text", node.text());
    }

    @Test
    public void testTextSetter() {
        TextNode node = new TextNode("Test text");
        node.text("New text");
        assertEquals("New text", node.coreValue());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Test text");
        assertEquals("Test text", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("  \n  ");
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Test text");
        TextNode tailNode = node.splitText(4);
        assertEquals("Test", node.coreValue());
        assertEquals(" text", tailNode.coreValue());
    }

}