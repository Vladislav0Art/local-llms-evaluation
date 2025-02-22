package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testTextNodeConstructor() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
    }

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

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
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", textNode2.getWholeText());
    }

    @Test
    public void testSplitText_NegativeOffset() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

    @Test
    public void testSplitText_OffsetGreaterThanLength() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}