package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void newTextNode_GivenNonEmptyString_ReturnsTextNodes() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeName_ReturnsnodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void clone_ReturnsClonedTextNode() throws CloneNotSupportedException {
        String text = "Hello";
        TextNode textNode1 = new TextNode(text);
        TextNode textNode2 = (TextNode) textNode1.clone();
        assertEquals(text, textNode2.text());
    }

    @Test
    public void outerHtmlHead_GivenTextAndSettingsReturnsCorrectHtml() throws IOException {
        String text = "Hello";
        Appendable outContent = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(outContent, 0, settings);
        assertEquals("<p>" + text + "</p>", ((StringBuilder) outContent).toString());
    }

    @Test
    public void outerHtmlTail_GivenTextAndSettingsReturnsCorrectHtml() {
        String text = "Hello";
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        StringBuilder outContent = new StringBuilder();
        textNode.outerHtmlTail(outContent, 0, settings);
        assertEquals("", outContent.toString());
    }

    @Test
    public void getWholeText_ReturnsCorrectText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsFalseForNonEmptyString() {
        String text = "Hello";
        assertFalse(TextNode.isBlank());
        assertTrue(TextNode.isBlank(""));
        assertFalse(TextNode.isBlank("   "));
    }

    @Test
    public void createFromEncoded_GivenEncodedTextAndReturnsCorrectTextNode() {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void normaliseWhitespace_GivenStringAndReturnsCorrectNormalisedString() {
        String text = "Hello\nWorld!";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals("Hello World!", result);
    }

    @Test
    public void stripLeadingWhitespace_GivenStringAndReturnsCorrectStripedString() {
        String text = "  Hello";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertEquals("Hello", result);
    }

    @Test
    public void lastCharIsWhitespace_GivenStringBuilderAndReturnsFalseForNonWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        assertFalse(TextNode.lastCharIsWhitespace(sb));
        assertTrue(TextNode.lastCharIsWhitespace("\n"));
        assertTrue(TextNode.lastCharIsWhitespace(" "));
    }
}

class Document {
    public static class OutputSettings {
    }
}

class StringUtil {
    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String text) {
        return text.trim();
    }

}