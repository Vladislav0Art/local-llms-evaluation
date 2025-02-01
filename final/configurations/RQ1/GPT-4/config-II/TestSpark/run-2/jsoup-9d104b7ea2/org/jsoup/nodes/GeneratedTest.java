package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("         Hello World           ");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void textChainTest() {
        TextNode textNode = new TextNode("Hello");
        textNode.text("World");
        assertEquals("World", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Hello\n\t World");
        assertEquals("Hello\n\t World", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode blankTextNode = new TextNode("       \n       ");
        assertTrue(blankTextNode.isBlank());
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode splittedNode = textNode.splitText(6);
        assertEquals("World", splittedNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
        assertNotSame(textNode, clonedNode);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello World&gt;");
        assertEquals("<Hello World>", textNode.getWholeText());
    }

}