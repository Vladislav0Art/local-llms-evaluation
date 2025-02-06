package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void [TextNode_text]

    Test() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void [TextNode_nodeName]

    Test() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void [TextNode_clone]

    Test() throws IOException {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

    @Test
    public void [TextNode_createFromEncoded]

    Test() throws IOException {
        TextNode textNode = TextNode.createFromEncoded("%5CHello%20World%");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void [TextNode_normaliseWhitespace]

    Test() {
        assertEquals("   ", TextNode.normaliseWhitespace("\t\r\n  "));
    }

    @Test
    public void [TextNode_stripLeadingWhitespace]

    Test() {
        assertEquals("Hello World", TextNode.stripLeadingWhitespace("   Hello World"));
    }

    @Test
    public void [TextNode_isBlank]

    Test() {
        TextNode blankTextNode = new TextNode("");
        assertTrue(blankTextNode.isBlank());
        TextNode nonBlankTextNode = new TextNode("Hello World");
        assertFalse(nonBlankTextNode.isBlank());
    }

    @Test
    public void [TextNode_splitText]

    Test() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = textNode.splitText(6);
        assertNotNull(splitTextNode);
        assertEquals("World", splitTextNode.text());
    }

}