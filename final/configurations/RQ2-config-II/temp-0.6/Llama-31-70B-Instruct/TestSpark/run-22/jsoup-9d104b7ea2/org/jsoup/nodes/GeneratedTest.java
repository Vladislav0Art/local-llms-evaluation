package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    private TextNode textNode;

    @Test
    public void testConstructor() {
        textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void testNodeName() {
        textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void testTextSet() {
        textNode = new TextNode("");
        textNode.text("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}