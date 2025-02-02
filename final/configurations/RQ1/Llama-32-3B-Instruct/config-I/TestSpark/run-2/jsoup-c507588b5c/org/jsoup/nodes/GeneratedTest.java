package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenValidText_ReturnsTextNode() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode actual = new TextNode(text);

        // Assert
        assertEquals(text, actual.value);
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() {
        // Arrange
        TextNode textNode = new TextNode("some text");

        // Act
        String result = textNode.nodeName();

        // Assert
        assertEquals("#text", result);
    }

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");
        int expectedLength = "Hello World".length();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String result = textNode.text();

        // Act and Assert
        assertEquals(StringUtil.normaliseWhitespace("Hello World"), result);
        assertEquals(expectedLength, outContent.size());
    }

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        String result = textNode.text();

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test
    public void isBlank_GivenBlankTextNode_ReturnsTrue() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertTrue(result);
    }

    @Test
    public void isBlank_GivenNonEmptyTextNode_ReturnsFalse() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertFalse(result);
    }

    @Test
    public void splitText_GivenValidTextOffset_ReturnsCorrectTextNode() throws IOException {
        // Arrange
        String originalText = "Hello World";
        int offset = 5;
        TextNode textNode = new TextNode(originalText);

        // Act
        TextNode actual = textNode.splitText(offset);

        // Assert
        assertEquals(4, actual.value.length());
    }

    @Test
    public void splitText_GivenInvalidOffset_ReturnsException() {
        // Arrange
        String originalText = "Hello World";
        int offset = -1;
        TextNode textNode = new TextNode(originalText);

        // Act and Assert
        assertThrows(IndexOutOfBoundsException.class, () -> textNode.splitText(offset));
    }

    @Test
    public void outerHtml_GivenValidTreeNode_ReturnsCorrectHtml() throws IOException {
        // Arrange
        String expectedHtml = "<p>Hello World</p>";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode textNode = new TextNode("Hello World");

        // Act and Assert
        textNode.outerHtmlHead(new StringBuilder(), 0, Document.OutputSettings.STATIC);
        assertEquals(expectedHtml, outContent.toString());
    }

    @Test
    public void outerHtml_GivenBlankTextNode_ReturnsCorrectHtml() throws IOException {
        // Arrange
        String expectedHtml = "<p> </p>";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode textNode = new TextNode("");

        // Act and Assert
        textNode.outerHtmlHead(new StringBuilder(), 0, Document.OutputSettings.STATIC);
        assertEquals(expectedHtml, outContent.toString());
    }

    @Test
    public void createFromEncoded_ReturnsCorrectTextNode() {
        // Arrange
        String encodedText = "&lt;Hello World&gt;";
        TextNode expectedTextNode = new TextNode("Hello World");

        // Act
        TextNode actual = TextNode.createFromEncoded(encodedText);

        // Assert
        assertEquals(expectedTextNode, actual);
    }

    @Test
    public void stripLeadingWhitespace_ReturnsCorrectString() {
        // Arrange
        String originalText = "   Hello World";
        StringBuilder expectedStringBuilder = new StringBuilder("Hello World");

        // Act and Assert
        assertEquals(expectedStringBuilder.toString(), TextNode.stripLeadingWhitespace(originalText));
    }

}