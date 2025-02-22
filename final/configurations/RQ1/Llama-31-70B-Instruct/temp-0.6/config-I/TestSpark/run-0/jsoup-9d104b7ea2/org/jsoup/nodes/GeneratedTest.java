package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        // Arrange
        String text = "Some text";

        // Act
        TextNode textNode = new TextNode(text);

        // Assert
        assertEquals(text, textNode.coreValue());
    }

    @Test
    public void nodeNameTest() {
        // Arrange
        TextNode textNode = new TextNode("Some text");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("#text", nodeName);
    }

    @Test
    public void textTest() {
        // Arrange
        String text = "Some text";
        TextNode textNode = new TextNode(text);

        // Act
        String actualText = textNode.text();

        // Assert
        assertEquals("Some text", actualText);
    }

    @Test
    public void textWithNewlinesTest() {
        // Arrange
        String text = "Some text\n\nAnother text";
        TextNode textNode = new TextNode(text);

        // Act
        String actualText = textNode.text();

        // Assert
        assertEquals("Some text Another text", actualText);
    }

    @Test
    public void getWholeTextTest() {
        // Arrange
        String text = "Some text";
        TextNode textNode = new TextNode(text);

        // Act
        String actualText = textNode.getWholeText();

        // Assert
        assertEquals("Some text", actualText);
    }

    @Test
    public void isBlankTest() {
        // Arrange
        String text = "";
        TextNode textNode = new TextNode(text);

        // Act
        boolean isBlank = textNode.isBlank();

        // Assert
        assertTrue(isBlank);
    }

}