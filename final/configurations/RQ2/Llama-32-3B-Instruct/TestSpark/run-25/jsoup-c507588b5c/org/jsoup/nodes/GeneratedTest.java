package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyTextNode_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

    @Test
    public void text_EmptyTextNode_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void text_NewTextNode_ReturnsTextValue() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void text_MultipleSpaces_ReturnsTextWithSpaces() {
        String text = "   Hello World  ";
        TextNode node = new TextNode(text);
        assertEquals("   Hello World  ", node.text());
    }

    @Test
    public void splitText_SplittingAtEnd_ReturnsSameTextNode() {
        TextNode node = new TextNode("Hello");
        TextNode result = node.splitText(node.text().length());
        assertTrue(result.equals(node));
    }

    @Test
    public void outerHtmlHead_HtmlWithOffset_ThrowsIOException() {
        TextNode node = new TextNode("");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        try {
            node.outerHtmlHead(accum, 1, out);
            fail("Expected IOException");
        } catch (Exception e) {
            assertTrue(e instanceof java.io.IOException);
        }
    }

    @Test
    public void outerHtmlTail_HtmlWithoutOffset_ThrowsNullPointerException() {
        TextNode node = new TextNode("");
        Appendable accum = null;
        try {
            node.outerHtmlHead(accum, 1, null);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            assertTrue(e instanceof java.lang.NullPointerException);
        }
    }

    @Test
    public void clone_ClonedTextNode_ReturnsNewText() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = node.clone();
        assertNotSame(node, clone);
        assertTrue(clone.text().equals(node.text()));
    }

    @Test
    public void createFromEncoded_TextnodeCanBeCreatedFromFile() throws Exception {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
    }

}