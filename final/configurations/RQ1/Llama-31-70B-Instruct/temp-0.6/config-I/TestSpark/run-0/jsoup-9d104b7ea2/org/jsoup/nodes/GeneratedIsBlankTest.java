package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

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