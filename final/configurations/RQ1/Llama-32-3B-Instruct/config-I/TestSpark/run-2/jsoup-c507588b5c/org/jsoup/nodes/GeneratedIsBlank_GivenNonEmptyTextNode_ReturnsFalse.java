package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedIsBlank_GivenNonEmptyTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyTextNode_ReturnsFalse() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertFalse(result);
    }

}