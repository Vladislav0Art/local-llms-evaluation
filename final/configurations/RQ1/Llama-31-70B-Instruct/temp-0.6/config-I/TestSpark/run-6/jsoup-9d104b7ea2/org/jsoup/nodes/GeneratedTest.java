package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testTextNodeWithInitialText() {
        TextNode textNode = new TextNode("Sample text");
        assertEquals("Sample text", textNode.getWholeText());
        assertEquals("Sample text", textNode.toString());
    }

    @Test
    public void testTextNodeWithNullText() {
        TextNode textNode = new TextNode(null);
        assertNull(textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

    @Test
    public void testTextNodeWithEmptyText() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

    @Test
    public void testTextNodeTextSetter() {
        TextNode textNode = new TextNode("Initial text");
        textNode.text("New text");
        assertEquals("New text", textNode.getWholeText());
        assertEquals("New text", textNode.toString());
    }

    @Test
    public void testTextNodeTextSetterWithNull() {
        TextNode textNode = new TextNode("Initial text");
        textNode.text(null);
        assertNull(textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

    @Test
    public void testTextNodeTextSetterWithEmptyString() {
        TextNode textNode = new TextNode("Initial text");
        textNode.text("");
        assertEquals("", textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

}