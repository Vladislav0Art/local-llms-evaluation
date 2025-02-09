package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void textNewTextTest() {
        String text = "Test text";
        String newText = "New Test text";
        TextNode textNode = new TextNode(text);
        textNode = textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        String text = "    ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "Test text";
        int offset = 4;
        String expected = "Test";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(offset);
        assertEquals(expected, splitNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        TextNode cloneNode = textNode.clone();
        assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Test text&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>Test text</p>", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "Test    text";
        String expected = "Test text";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "    Test text";
        String expected = "Test text";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Test text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("Test text");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals(text, sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

}