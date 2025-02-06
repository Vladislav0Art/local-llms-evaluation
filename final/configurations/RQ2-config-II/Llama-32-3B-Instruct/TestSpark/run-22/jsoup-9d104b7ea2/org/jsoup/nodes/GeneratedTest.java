package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameReturnsTextNode() {
        TextNode textNode = new TextNode("text");
        assertEquals(TextNode.class.getName(), textNode.nodeName());
    }

    @Test
    public void textReturnsTextContent() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void textSetsTextNodeContent() {
        String expectedText = "newText";
        TextNode textNode = new TextNode(expectedText);
        textNode.text("newText");
        assertEquals("newText", textNode.text());
    }

    @Test
    public void splitTextSplitsTextNodeAtOffset() throws IOException {
        String text = "hello world";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int offset = 5;
        TextNode result = textNode.splitText(offset);
        assertTrue(result != null);
        assertEquals("world", result.text());
    }

    @Test
    public void getWholeTextReturnsWholeTextNodeText() {
        String expectedText = "text";
        TextNode textNode = new TextNode(expectedText);
        assertEquals(expectedText, textNode.getWholeText());
    }

    @Test
    public void isBlankReturnsTrueForEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankReturnsFalseForNonEmptyTextNode() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void cloneCreatesNewTextNode() throws IOException {
        String expectedText = "cloneText";
        TextNode textNode = new TextNode(expectedText);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = null;
        TextNode result = textNode.clone();
        assertTrue(result != null);
        assertEquals("cloneText", result.getWholeText());
    }

    @Test
    public void createFromEncodedCreatesTextNodeFromEncodedString() throws IOException {
        String expectedText = "createFromEncodedText";
        TextNode textNode = TextNode.createFromEncoded(expectedText);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = null;
        assertTrue(textNode != null);
        assertEquals("createFromEncodedText", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceReturnsNormalisedString() {
        String expectedText = "normalisedText";
        TextNode testNode = new TextNode(expectedText);
        String result = TextNode.normaliseWhitespace(testNode.text());
        assertEquals("expectedText", result);
    }

    @Test
    public void stripLeadingWhitespaceReturnsStripedString() {
        String expectedText = "strippedText";
        TextNode testNode = new TextNode(expectedText);
        String result = TextNode.stripLeadingWhitespace(testNode.text());
        assertEquals("expectedText", result);
    }

    @Test
    public void lastCharIsWhitespaceReturnsFalseWhenCharIsNotWhitespace() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

    @Test
    public void lastCharIsWhitespaceReturnsTrueWhenCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("   ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}