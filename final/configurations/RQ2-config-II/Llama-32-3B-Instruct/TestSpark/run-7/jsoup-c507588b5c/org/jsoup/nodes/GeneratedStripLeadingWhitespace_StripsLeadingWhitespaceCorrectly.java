package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedStripLeadingWhitespace_StripsLeadingWhitespaceCorrectly {

    @Test
    public void stripLeadingWhitespace_StripsLeadingWhitespaceCorrectly() {
        // Arrange
        String text = "   Hello World";

        // Act & Assert
        String expected = "Hello World";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

}