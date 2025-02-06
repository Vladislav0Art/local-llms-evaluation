package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.text());
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsText() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_GivenTextNode_ReturnsText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void text_GivenTextNodeAndNewText_ReturnsUpdatedText() {
        TextNode node = new TextNode("Hello World");
        String newText = "Hello Universe";
        TextNode updatedNode = node.text(newText);
        assertEquals(newText, updatedNode.text());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() {
        TextNode node = new TextNode("");
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlank_GivenEmptyTextNode_ReturnsTrue() {
        TextNode node = new TextNode();
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_GivenTextNodeAndOffset_ReturnsUpdatedTextNode() {
        TextNode node = new TextNode("Hello World");
        int offset = 6;
        TextNode updatedNode = node.splitText(offset);
        assertEquals("World", updatedNode.text());
    }

    @Test
    public void outerHtmlHead_GivenAppendableAndDepth_ThrowsIOException() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        assertThrows(IOException.class, () -> new TextNode().outerHtmlHead(accum, depth, out));
    }

    @Test
    public void outerHtmlTail_GivenAppendableAndDepth_NoThrow() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        new TextNode().outerHtmlTail(accum, depth, out);
    }

    @Test
    public void clone_GivenTextNode_ReturnsSameNodeType() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = node.clone();
        assertEquals(TextNode.class, clonedNode.getClass());
        assertEquals(node.text(), clonedNode.text());
    }

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "Hello%20World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void normaliseWhitespace_GivenText_ReturnsNormalisedText() {
        String text = "   Hello World  ";
        String normalisedText = TextNode.normaliseWhitespace(text);
        assertEquals("Hello World", normalisedText);
    }

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsStripedText() {
        String text = "   Hello World  ";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        assertEquals("Hello World", strippedText);
    }

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsTrue() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.length()).thenReturn(1);
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}