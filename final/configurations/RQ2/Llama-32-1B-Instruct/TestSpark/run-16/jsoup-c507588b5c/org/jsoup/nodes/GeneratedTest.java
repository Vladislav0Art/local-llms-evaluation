package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void test

    nodeName() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        String nodeName = textNode.getNodeName();

        // Assert
        assertEquals("text", nodeName);
    }

    @Test
    public void test

    text() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        String textContent = textNode.getText();

        // Assert
        assertNotNull(contentText);
        assertEquals("Hello World", contentText);
    }

    @Test
    public void test

    splitText() {
        // Arrange
        int offset = 5;
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);

        // Assert
        assertNotNull(result);
        assertEquals("Hello", result.getText());
    }

    @Test
    public void test

    outerHtmlHead() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(2048, false);

        // Act
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, depth, out);

        // Assert
        assertEquals("Hello World", accum.toString());
    }

    @Test
    public void test

    outerHtmlTail() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(2048, false);

        // Act
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, depth, out);

        // Assert
        assertEquals("", accum.toString());
    }

    @Test
    public void test

    toString() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        String result = textNode.toString();

        // Assert
        assertNotNull(result);
        assertEquals("Hello World", result);
    }

    @Test
    public void test

    clone() {
        // Arrange
        String text = "Hello World";
        TextNode expected = new TextNode(text);

        // Act
        TextNode actual = new TextNode(text).clone();

        // Assert
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test

    createFromEncoded() {
        // Arrange
        String encodedText = "Hello World";

        // Act
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Assert
        assertNotNull(textNode);
        assertEquals("Hello World", textNode.getText());
    }

    @Test
    public void test

    normaliseWhitespace() {
        // Arrange
        String text = "   Hello World  ";

        // Act
        String result = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals("Hello World", result);
    }

    @Test
    public void test

    stripLeadingWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello World  ");

        // Act
        String result = TextNode.stripLeadingWhitespace(sb.toString());

        // Assert
        assertEquals("Hello World", result);
    }

    @Test
    public void test

    lastCharIsWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello");

        // Act
        boolean result = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(result);
    }

}