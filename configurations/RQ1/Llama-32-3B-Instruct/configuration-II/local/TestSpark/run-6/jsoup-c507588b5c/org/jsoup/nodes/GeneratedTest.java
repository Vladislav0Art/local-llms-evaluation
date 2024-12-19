package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertTrue(textNode.text().equals("Hello World"));
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello\nWorld");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello\nWorld", wholeText);
    }

    @Test
    public void isBlank_GivenBlankTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenOffset_LimitedToWholeTextLength() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        int offset = 5;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(6, tailNode.getWholeText().length());
    }

    @Test
    public void splitText_GivenOffset_OutsideOfTextLength_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        int offset = 10;
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

    @Test
    public void outerHtml_WithEmptyTextNode_ReturnsUnchangedText() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(new StringBuffer(), 0, settings);
        String outerHtml = outContent.toString();
        assertEquals("", outerHtml.trim());
    }

    @Test
    public void normaliseWhitespace_GivenText_ReturnsUnchangedText() {
        String text = "   Hello World";
        String expected = "   Hello World";
        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void createTextNode_FromEncodedText_ReturnsTextNodeWithUnencodedData() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt;");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertTrue(textNode.text().equals("<Hello>"));
    }

}