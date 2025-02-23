package org.jsoup.nodes;

import static org.jsoup.nodes.TextNode.createFromEncoded;
import static org.jsoup.nodes.TextNode.normaliseWhitespace;
import static org.jsoup.nodes.TextNode.stripLeadingWhitespace;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setup() {
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
    public void testSetText() {
        textNode.text("new text");
        assertEquals("new text", textNode.text());
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
        assertEquals("te", textNode.coreValue());
        assertEquals("xt", tailNode.coreValue());
    }

    @Test
    public void testOuterHtmlHead() {
        final StringBuilder accum = new StringBuilder();
        final int depth = 3;
        final Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("text", accum.toString());
    }

}