package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testConstructor() {
        assertEquals("test", textNode.coreValue());
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("test", textNode.text());
    }

    @Test
    public void testTextWithNull() {
        textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void testSetText() {
        textNode.text("new text");
        assertEquals("new text", textNode.coreValue());
    }

    @Test
    public void testSetTextWithNull() {
        textNode.text(null);
        assertEquals("", textNode.coreValue());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testIsBlankWithNull() {
        textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testIsBlankWithEmptyString() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}