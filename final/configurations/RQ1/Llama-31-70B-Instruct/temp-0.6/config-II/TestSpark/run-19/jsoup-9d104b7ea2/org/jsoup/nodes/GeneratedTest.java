package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testTextNodeCreation() {
        String text = "This is a test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void testTextNodeCreationFromEncoded() {
        String encodedText = "&lt;p&gt;This is a test&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>This is a test</p>", textNode.text());
    }

    @Test
    public void testTextNodeNodeName() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testTextNodeIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testTextNodeIsNotBlank() {
        TextNode textNode = new TextNode("This is a test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testTextNodeSplitText() {
        String text = "This is a test";
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(7);
        assertEquals("This is", textNode.text());
        assertEquals("a test", splitTextNode.text());
    }

}