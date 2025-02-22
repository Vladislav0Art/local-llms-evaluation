package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode tailNode = textNode.splitText(2);
        assertEquals("xt", tailNode.getWholeText());
        assertEquals("te", textNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("text", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

    @Test
    public void testToString() {
        assertEquals("text", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode clone = textNode.clone();
        assertEquals("text", clone.getWholeText());
    }

}