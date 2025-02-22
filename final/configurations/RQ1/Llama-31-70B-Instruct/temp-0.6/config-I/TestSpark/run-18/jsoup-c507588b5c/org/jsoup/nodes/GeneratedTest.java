package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

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
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("test", accum.toString());
    }

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "&lt;test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<test>", textNode.getWholeText());
    }

}