package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("test");
        StringBuilder builder = new StringBuilder();
        textNode.outerHtmlHead(builder, 0, null);
        assertEquals("test", builder.toString());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = (TextNode) textNode.clone();
        assertEquals("test", cloneNode.getWholeText());
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("&lt;");
        assertEquals("<", textNode.getWholeText());
    }

}