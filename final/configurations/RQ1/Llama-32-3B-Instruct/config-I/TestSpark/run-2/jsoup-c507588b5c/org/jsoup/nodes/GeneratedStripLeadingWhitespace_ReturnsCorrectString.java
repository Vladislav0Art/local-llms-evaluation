package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespace_ReturnsCorrectString {

    @Test
    public void stripLeadingWhitespace_ReturnsCorrectString() {
        // Arrange
        String originalText = "   Hello World";
        StringBuilder expectedStringBuilder = new StringBuilder("Hello World");

        // Act and Assert
        assertEquals(expectedStringBuilder.toString(), TextNode.stripLeadingWhitespace(originalText));
    }

}