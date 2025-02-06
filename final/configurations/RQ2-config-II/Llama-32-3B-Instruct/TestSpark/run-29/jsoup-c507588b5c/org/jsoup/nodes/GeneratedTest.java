package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void newTextNodeWithNonEmptyTextHasCorrectName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void newTextNodeWithBlankTextHasCorrectName() {
        TextNode textNode = new TextNode("");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void getWholeTextReturnsOriginalText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlankReturnsTrueForBlankText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankReturnsFalseForNonBlankText() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextChangesTheWholeText() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(7);
        assertEquals("", textNode.text());
        assertTrue(result != null);
    }

    @Test
    public void outerHtmlHeadAccumulatesCorrectly() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("<p>Hello World</p>", accum.toString());
    }

    @Test
    public void outerHtmlTailAccumulatesCorrectly() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("</p>", accum.toString());
    }

    @Test
    public void cloneReturnsNewTextNode() {
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertTrue(!original.equals(cloned));
    }

    @Test
    public void createFromEncodedCreatesCorrectTextNode() throws IOException {
        TextNode textNode = TextNode.createFromEncoded("<p>Hello World</p>");
        assertEquals("Hello World", textNode.getWholeText());
    }

}