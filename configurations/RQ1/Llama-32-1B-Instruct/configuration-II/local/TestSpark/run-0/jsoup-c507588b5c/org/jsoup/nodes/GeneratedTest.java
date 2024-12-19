package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testIsBlank_EmptyText() {
        // Arrange
        String text = "";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertTrue(result.isBlank());
    }

    @Test
    public void testSplitText_SingleCharOffset() {
        // Arrange
        String text = "Hello";
        int offset = 1;
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertTrue(result.splitText(offset).isBlank());
    }

    @Test
    public void testSplitText_MultipleCharsOffset() {
        // Arrange
        String text = "Hello World";
        int offset = 1;
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertTrue(result.splitText(offset).isBlank());
    }

    @Test
    public void testSplitText_NoOffset() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertFalse(result.splitText(0).isBlank());
    }

    @Test
    public void testOuterHtmlHead_MultipleLevels() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.outerHtmlHead(new Appendable(), 0, Document.OutputSettings()));
    }

    @Test
    public void testOuterHtmlTail_MultipleLevels() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.outerHtmlTail(new Appendable(), 0, Document.OutputSettings()));
    }

    @Test
    public void testClone_MultipleLevels() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.clone().outerHtmlHead(new Appendable(), 0, Document.OutputSettings()));
    }

    @Test
    public void testToString_EmptyText() {
        // Arrange
        String text = "";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.toString());
    }

}