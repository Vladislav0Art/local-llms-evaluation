package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "Test TextNode instance";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("#text");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textGetterTest() {
        TextNode textNode = new TextNode("sample text");
        assertEquals("sample text", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("sample text");
        textNode.text("updated text");
        assertEquals("updated text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        String text = "This is complete text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("split Text");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Text", splitNode.text());
        assertEquals("split ", textNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("outer text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document("").outputSettings());
        assertEquals("outer text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("outer text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document("").outputSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void ToStringTest() {
        TextNode textNode = new TextNode("to string text");
        assertEquals("to string text", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("clone text");
        TextNode cloneTextNode = textNode.clone();
        assertFalse(textNode == cloneTextNode);
        assertEquals(textNode.text(), cloneTextNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("encoded text", false);
        assertEquals("encoded text", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = " normalize    whitespace";
        String normalizedSpace = TextNode.normaliseWhitespace(text);
        assertEquals(" normalize whitespace", normalizedSpace);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = "  strip leading whitespace";
        String stripedText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);
        assertEquals("strip leading whitespace", stripedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder stringBuilder = new StringBuilder("test string ");
        assertTrue(TextNode.lastCharIsWhitespace(stringBuilder));

        stringBuilder = new StringBuilder("test string");
        assertFalse(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}