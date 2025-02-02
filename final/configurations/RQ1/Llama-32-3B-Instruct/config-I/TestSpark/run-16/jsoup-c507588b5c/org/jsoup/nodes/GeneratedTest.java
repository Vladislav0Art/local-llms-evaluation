package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals("#text", node.nodeName());
        assertEquals(text, node.text());
        assertEquals(text, node.getWholeText());
        assertTrue(node.isBlank());
    }

    @Test
    public void createTextNode_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "&lt;Hello&gt; World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("#text", node.nodeName());
        assertEquals("Hello World", node.text());
        assertEquals("Hello World", node.getWholeText());
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_GivenOffset_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode tailNode = node.splitText(offset);
        assertNotNull(tailNode);
        assertEquals("#text", tailNode.nodeName());
        assertTrue(node.isBlank());
        assertEquals("Hello ", tailNode.text());
        assertEquals("Hello ", tailNode.getWholeText());
    }

    @Test
    public void splitText_GivenInvalidOffset_ThrowsAssertionError() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 7;
        assertThrows(AssertionError.class, () -> node.splitText(offset));
    }

    @Test
    public void outerHtmlHead_GivenEmptyTextNode_ReturnsEmptyString() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        TextNode node = new TextNode("");
        Node child = mock(Node.class);
        when(node.parentNode()).thenReturn(child);
        String result = node.outerHtmlHead(accum, depth, out);
        assertEquals("", result);
    }

    @Test
    public void outerHtmlHead_GivenNotBlankTextNode_ReturnsCorrectString() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        String text = "Hello World";
        TextNode node = new TextNode(text);
        Node child = mock(Node.class);
        when(node.parentNode()).thenReturn(child);
        when(out.prettyPrint()).thenReturn(true);
        String result = node.outerHtmlHead(accum, depth, out);
        assertEquals("<p>Hello World</p>", result);
    }

    @Test
    public void outerHtmlTail_GivenEmptyTextNode_ReturnsNoop() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        TextNode node = new TextNode("");
        Node child = mock(Node.class);
        when(node.parentNode()).thenReturn(child);
        String result = node.outerHtmlTail(accum, depth, out);
        assertTrue(result.isEmpty());
    }

    @Test
    public void outerHtmlTail_GivenNotBlankTextNode_ReturnsNoop() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        String text = "Hello World";
        TextNode node = new TextNode(text);
        Node child = mock(Node.class);
        when(node.parentNode()).thenReturn(child);
        String result = node.outerHtmlTail(accum, depth, out);
        assertTrue(result.isEmpty());
    }

    @Test
    public void clone_ReturnsSameTextNode() {
        TextNode node = new TextNode("Hello World");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals("#text", cloned.nodeName());
        assertEquals("Hello World", cloned.text());
        assertEquals("Hello World", cloned.getWholeText());
    }

    @Test
    public void createTextNode_GivenNullString_ThrowsNullPointerException() {
        String text = null;
        assertThrows(NullPointerException.class, () -> new TextNode(text));
    }

}