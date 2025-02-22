package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Test");
        String expected = "#text";
        assertEquals(expected, textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Test");
        String expected = "Test";
        assertEquals(expected, textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("Test");
        String expected = "Test";
        assertEquals(expected, textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("Test");
        boolean expected = false;
        assertEquals(expected, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Test");
        TextNode expected = new TextNode("est");
        assertEquals(expected, textNode.splitText(1));
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("Test");
        String expected = "Test";
        assertEquals(expected, textNode.toString());
    }

}