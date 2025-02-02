package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenText_ReturnsUnencodedNormalisedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void setTextNode_GivenText_ReturnsThis() {
        String text = "Hello World";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        assertNotNull(textNode);
    }

    @Test
    public void getWholeText_GivenText_ReturnsUnencodedNormalisedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlank_GivenEmptyText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void clone_ReturnsSameTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.clone();
        assertNotNull(result);
        assertEquals(text, result.text());
    }

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    public static class Node extends TextNode {
        public Node(String text) {
            super(text);
        }
    }

}