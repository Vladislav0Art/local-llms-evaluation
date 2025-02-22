package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("This is a text node", textNode.text());
        textNode.text("This is a new text node");
        assertEquals("This is a new text node", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("This is a text node", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
        TextNode blankTextNode = new TextNode("");
        assertTrue(blankTextNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("This ", textNode.getWholeText());
        assertEquals("is a text node", splitTextNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
            assertEquals("This is a text node", accum.toString());
        } catch (IOException e) {
            fail("Failed to test outerHtmlHead");
        }
    }

    @Test
    public void testToString() {
        assertEquals("This is a text node", textNode.toString());
    }

}