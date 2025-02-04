package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeTextNode() {
        TextNode node = new TextNode("Hello");
        assertNotNull(node);
        assertEquals("#text", node.nodeName());
        assertEquals("Hello", node.text());
    }

    @Test
    public void setNewTextNodeValue() {
        TextNode node = new TextNode("");
        node.text("World");
        assertEquals("", node.text());
    }

    @Test
    public void getWholeText() throws IOException {
        TextNode node = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", node.getWholeText());
    }

    @Test
    public void isBlank() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("\n");
        assertFalse(node2.isBlank());

        TextNode node3 = new TextNode("   ");
        assertFalse(node3.isBlank());
    }

    @Test
    public void splitText() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode tail = node.splitText(6);
        assertEquals("Hello", tail.text());
        assertNotNull(tail.parentNode());
        assertNotNull(tail);
    }

    @Test
    public void outerHtmlHead() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // mocking parentNode and appendChildren
        TextNode node = new TextNode("");
        node.parentNode = mock(Document.class);
        when(node.parentNode.addChildren()).thenReturn(document);

        node.outerHtmlHead(accum, 0, null);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTail() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // mocking parentNode and appendChildren
        TextNode node = new TextNode("");
        node.parentNode = mock(Document.class);
        when(node.parentNode.addChildren()).thenReturn(document);

        node.outerHtmlTail(accum, 0, null);
    }

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals("#text", cloned.nodeName());
        assertEquals("Hello", cloned.text());
    }

    @Test
    public void createFromEncoded() {
        String encodedText = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("&lt;Hello&gt;", node.getWholeText());
    }

}