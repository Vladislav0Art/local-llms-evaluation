package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("testNode");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("testNode");
        assertEquals("testNode", textNode.text());
    }

    @Test
    public void testTextWhenNull() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("testNode");
        assertEquals("testNode", textNode.getWholeText());
    }

    @Test
    public void testIsBlankWhenNull() {
        TextNode textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testIsBlankWhenEmpty() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testIsBlankWhenWhiteSpaces() {
        TextNode textNode = new TextNode("      ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testIsBlankWhenNotBlank() {
        TextNode textNode = new TextNode("testNode");
        assertFalse(textNode.isBlank());
    }

}