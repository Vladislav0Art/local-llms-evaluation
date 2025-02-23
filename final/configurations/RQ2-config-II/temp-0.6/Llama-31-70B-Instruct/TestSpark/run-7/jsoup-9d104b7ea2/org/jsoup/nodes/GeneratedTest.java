package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String result = textNode.text();

        // Assert
        assertEquals("test", result);
    }

    @Test
    public void testGetWholeText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String result = textNode.getWholeText();

        // Assert
        assertEquals("test", result);
    }

    @Test
    public void testIsBlank() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testSplitText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        TextNode result = textNode.splitText(2);

        // Assert
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", result.getWholeText());
    }

    @Test
    public void testCreateFromEncoded() {
        // Arrange
        String encodedText = "&lt;";

        // Act
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Assert
        assertEquals("<", result.getWholeText());
    }

}