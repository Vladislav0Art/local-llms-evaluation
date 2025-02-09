package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeDefaultConstructorTest() {
        TextNode textNode = new TextNode("Test text");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test text");
        assertEquals("Test text", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test text");
        textNode.text("Another test text");
        assertEquals("Another test text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test text");
        assertEquals("Test text", textNode.getWholeText());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Test text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test text");
        TextNode splitTextNode = textNode.splitText(4);
        assertEquals("Test", textNode.text());
        assertEquals(" text", splitTextNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test text");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test text", false);
        assertEquals("Test text", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace(" T e s t     t e x t ");
        assertEquals("T e s t t e x t", normalisedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace("   Test text");
        assertEquals("Test text", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder text = new StringBuilder("Test text");
        assertFalse(TextNode.lastCharIsWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder text = new StringBuilder("Test text ");
        assertTrue(TextNode.lastCharIsWhitespace(text));
    }

}