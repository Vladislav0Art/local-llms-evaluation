package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

    @Test
    public void testTextSetter() {
        TextNode node = new TextNode("test");
        node.text("newText");
        assertEquals("newText", node.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", splitNode.text());
    }

}