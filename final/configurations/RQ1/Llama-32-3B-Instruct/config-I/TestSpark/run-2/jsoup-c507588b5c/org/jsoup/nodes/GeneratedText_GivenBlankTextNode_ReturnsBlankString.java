package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedText_GivenBlankTextNode_ReturnsBlankString {

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        String result = textNode.text();

        // Assert
        assertTrue(result.isEmpty());
    }

}