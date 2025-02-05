package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testTextNodeConstructor() {
        TextNode textNode = new TextNode("Test Text Node");
        assertNotNull(textNode);
        assertEquals("Test Text Node", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test Text Node");
        String nodeName = textNode.nodeName();
        assertEquals("#text", nodeName);
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test Text Node");
        String text = textNode.text();
        assertEquals("Test Text Node", text);
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Test Text Node");
        textNode.text("Setting new text");
        String text = textNode.text();
        assertEquals("Setting new text", text);
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test Text Node");
        String wholeText = textNode.getWholeText();
        assertEquals("Test Text Node", wholeText);
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Text Node");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Split", textNode.text());
        assertEquals(" Text Node", splitNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test Text Node");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.text(), clonedNode.text());
        assertNotSame(textNode, clonedNode);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test &#x20AC; Text Node", true);
        assertEquals("Test € Text Node", textNode.text());
    }

    @Test
    public void illegalSplitTextTest() {
        TextNode tn = new TextNode("Lorem ipsum");
        tn.splitText(-1);
    }

}