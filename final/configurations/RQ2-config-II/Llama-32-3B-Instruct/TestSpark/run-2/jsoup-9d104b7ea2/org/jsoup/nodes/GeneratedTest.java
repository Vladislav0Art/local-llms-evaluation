package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_WhenCalled_ReturnsText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text_WhenCalled_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void text_GivenString_SetsTextOfTextNode() {
        TextNode textNode = new TextNode();
        textNode.text("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void getWholeText_WhenCalled_ReturnsText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlank_WhenCalled_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenEmptyString_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_WhenCalled_SplitsTextNodeAtOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode expectedChild = new TextNode("World");
        assertEquals(1, textNode.splitText(0).children().size());
        assertEquals(expectedChild, textNode.splitText(0));
    }

    @Test
    public void splitText_GivenOffset_BreaksTextNodeAtOffset() {
        TextNode textNode = new TextNode("Hello World");
        String expectedHtml = "<p>Hello <wbr>World</p>";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals(expectedHtml, accum.toString());
    }

    @Test
    public void outerHtmlHead_GivenEmptyString_ThrowsIOException() {
        TextNode textNode = new TextNode("");
        try {
            Appendable accum = new StringBuilder();
            Document.OutputSettings out = null;
            textNode.outerHtmlHead(accum, 0, out);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void outerHtmlTail_GivenEmptyString_ThrowsIOException() {
        TextNode textNode = new TextNode("");
        try {
            Appendable accum = new StringBuilder();
            Document.OutputSettings out = null;
            textNode.outerHtmlTail(accum, 0, out);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void toString_GivenTextNode_ReturnsStringRepresentation() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode.toString());
        assertEquals("text", textNode.toString().substring(0, 5));
    }

    @Test
    public void clone_ReturnsCloneOfTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

    @Test
    public void createFromEncoded_GivenEncodedString_ReturnsTextNode() {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

}