package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeWithEmptyString_ReturnsCorrectNode() {
        TextNode node = new TextNode("");
        assertNotNull(node);
    }

    @Test
    public void newNodeText_ReturnsCorrectNode() {
        TextNode node = new TextNode("Hello");
        assertNotNull(node);
    }

    @Test
    public void nodeName_ReturnsCorrectName() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_ReturnsBlankStringWhenEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void text_ReturnsCorrectText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void text_setsCorrectText() {
        TextNode node = new TextNode();
        node.text("");
        assertEquals("", node.text());
    }

    @Test
    public void getWholeText_ReturnsBlankStringWhenEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

    @Test
    public void isBlank_ReturnsTrueIfBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_ReturnsFalseIfNotBlank() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitText_splitsCorrectlyWithEmptyLeft() throws IOException {
        TextNode node = new TextNode("");
        assertEquals(null, node.splitText(0));
        assertEquals("", node.text());
    }

    @Test
    public void splitText_splitsCorrectly() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode expectedLeft = new TextNode("Hello ");
        TextNode expectedRight = new TextNode("World");
        assertEquals(expectedLeft, node.splitText(0));
        assertEquals(expectedRight, node.splitText(node.text().length()));
    }

    @Test
    public void splitText_ThrowsIOExceptionForInvalidOffset() throws IOException {
        TextNode node = new TextNode("Hello World");
        assertThrows(IOException.class, () -> node.splitText(-1));
    }

    @Test
    public void outerHtmlHead_appendsCorrectNodeWithEmptyString() throws IOException {
        StringBuilder expected = new StringBuilder("<p></p>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, 0, out);
        assertEquals(expected.toString(), accum.toString());
    }

    @Test
    public void outerHtmlTail_appendsCorrectNode() throws IOException {
        StringBuilder expected = new StringBuilder("<p>Hello World</p>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode("Hello World");
        node.outerHtmlTail(accum, 0, out);
        assertEquals(expected.toString(), accum.toString());
    }

    @Test
    public void toString_ReturnsCorrectStringForEmptyText() {
        TextNode node = new TextNode("");
        assertEquals("text=''", node.toString());
    }

    @Test
    public void clone_ReturnsNewTextNodeWithEmptyText() {
        TextNode node = new TextNode("");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals("", clone.text());
    }

    @Test
    public void createFromEncoded_ReturnsCorrectTextNodeForEmptyString() {
        String encodedText = "<p></p>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}