package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void constructorTextTest() {
        // Arrange
        String text = "test";

        // Act
        TextNode node = new TextNode(text);

        // Assert
        assertEquals(text, node.text());
    }

    @Test
    public void constructorNullTextTest() {
        // Arrange
        String text = null;

        // Act
        TextNode node = new TextNode(text);

        // Assert
        assertEquals(text, node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("test");

        String newText = "new text";
        TextNode newNode = node.text(newText);

        assertEquals(newText, newNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlankEmptyTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}