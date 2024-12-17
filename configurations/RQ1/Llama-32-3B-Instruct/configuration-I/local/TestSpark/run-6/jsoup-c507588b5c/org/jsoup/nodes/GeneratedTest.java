package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

    @Test
    public void getWholeText_TextNode_ReturnsUnencodedText() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello World", wholeText);
    }

    @Test
    public void splitText_SplittingAtOffset_ReturnsCorrectTextNode() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World", tailNode.text());
    }

    @Test
    public void isBlank_TextNode_ReturnsTrueWhenBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_TextNode_ReturnsFalseWhenNotBlank() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = original.clone();
        assertEquals(original, cloned);
    }

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNodeWithUnencodedText() throws IOException {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", textNode.text());
    }

    @Test
    public void nodeName_TextNode_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.nodeName().equals("#text"));
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = original.clone();
        assertTrue(original.equals(cloned));
    }

}