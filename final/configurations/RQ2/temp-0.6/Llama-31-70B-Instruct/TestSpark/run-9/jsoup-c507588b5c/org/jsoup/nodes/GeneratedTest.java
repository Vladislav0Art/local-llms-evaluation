package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

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
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", textNode2.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("test", accum.toString());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = (TextNode) textNode.clone();
        assertEquals("test", textNode2.getWholeText());
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("test");
        assertEquals("test", textNode.getWholeText());
    }

}