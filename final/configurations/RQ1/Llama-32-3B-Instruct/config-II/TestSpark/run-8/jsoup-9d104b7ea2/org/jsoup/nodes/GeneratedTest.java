package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void CreateTextNode_GivenString_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World ");
        assertEquals("Hello World ", textNode.text());
    }

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
        textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenOffset_ReturnsCorrectTextNode() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;
        TextNode resultTextNode = textNode.splitText(offset);
        assertNotNull(resultTextNode);
        assertEquals(7, resultTextNode.text().length());
    }

    @Test
    public void outerHtmlHead_GivenDocumentSettings_ReturnsCorrectOuterHTML() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document document = mock(Document.class);
        when(document.parentNode).thenReturn(document);
        textNode.outerHtmlHead(accum, depth, outSettings);
        String outerHTML = accum.toString();
        assertNotNull(outerHTML);
    }

    @Test
    public void splitText_GivenInvalidOffset_ThrowsAssertionError() {
        TextNode textNode = new TextNode("Hello World");
        int offset = -1;
        try {
            textNode.splitText(offset);
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            assertEquals("Split offset must be not be negative", e.getMessage());
        }
    }

    @Test
    public void clone_GivenTextNode_ReturnsCorrectClone() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

    static class Mockable extends Object {

        private Object mock;

        public Mockable(Object mock) {
            this.mock = mock;
        }

        public Object getMock() {
            return mock;
        }
    }

}