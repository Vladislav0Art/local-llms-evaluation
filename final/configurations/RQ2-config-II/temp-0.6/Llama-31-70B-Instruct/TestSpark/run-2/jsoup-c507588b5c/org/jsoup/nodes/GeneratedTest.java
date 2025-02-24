package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
    public void testTextWithNull() {
        TextNode node = new TextNode("test");
        node.text(null);
        assertEquals("", node.text());
    }

    @Test
    public void testTextWithEmptyString() {
        TextNode node = new TextNode("test");
        node.text("");
        assertEquals("", node.text());
    }

    @Test
    public void testTextWithNewText() {
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
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testIsNotBlank() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

}