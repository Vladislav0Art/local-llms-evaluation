package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenString_ReturnsTextNode() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.value());
    }

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello", textNode.text());
    }

    @Test
    public void text_GivenBlankText_ReturnsBlankText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.text());
    }

    @Test
    public void splitText_GivenOffset_SplitsTextNodeCorrectly() throws IOException {
        String text = "Hello World";
        int offset = 7;
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("Hello", tailNode.text());
        assertNotNull(tailNode.parentNode());
    }

    @Test
    public void splitText_GivenNegativeOffset_ThrowsAssertionError() {
        String text = "Hello World";
        int offset = -1;
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

    @Test
    public void outerHtmlHead_GivenSettings_DoesNotSplitString() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();
        int depth = 0;
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("Hello World", accum.toString());
    }

    @Test
    public void outerHtmlTail_GivenSettings_DoesNotSplitString() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();
        int depth = 0;
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void clone_ReturnsNewTextNode() {
        String text = "Hello";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.value(), clonedTextNode.text());
    }

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello", textNode.value());
    }

}