package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createTextNodeIsEmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNull(textNode.text());
    }

    @Test
    public void createTextNodeNonEmptyText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void nodeNameIsText() {
        TextNode textNode = new TextNode("");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void getWholeTextFromEmptyNode() {
        TextNode textNode = new TextNode("");
        assertNull(textNode.getWholeText());
    }

    @Test
    public void getWholeTextFromNonEmptyNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlankIsFalseForNonEmptyText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankIsTrueForEmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextOffsetAtStart() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Node result1 = textNode.splitText(0);
        assertEquals("Hello", ((TextNode) result1).text());
        assertNotNull(result1.nextSibling());

        Node result2 = result1.nextSibling();
        assertNull(((TextNode) result2).text());
    }

    @Test
    public void splitTextOffsetAtEnd() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Node result1 = textNode.splitText(text.length());
        assertEquals("", ((TextNode) result1).text());
        assertNull(result1.nextSibling());

        assertNotNull(result1.previousSibling());
    }

    @Test
    public void outerHtmlHeadWithDepth0() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(accum, 0, out);
        // Stub output
    }

    @Test
    public void outerHtmlTailWithDepth0() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, 0, out);
        // Stub output
    }

    @Test
    public void cloneReturnsSameInstance() {
        TextNode original = new TextNode("");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original, cloned);
    }

}