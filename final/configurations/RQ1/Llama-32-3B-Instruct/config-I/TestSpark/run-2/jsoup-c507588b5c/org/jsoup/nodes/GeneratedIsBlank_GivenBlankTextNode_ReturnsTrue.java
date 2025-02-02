package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedIsBlank_GivenBlankTextNode_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankTextNode_ReturnsTrue() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertTrue(result);
    }

}