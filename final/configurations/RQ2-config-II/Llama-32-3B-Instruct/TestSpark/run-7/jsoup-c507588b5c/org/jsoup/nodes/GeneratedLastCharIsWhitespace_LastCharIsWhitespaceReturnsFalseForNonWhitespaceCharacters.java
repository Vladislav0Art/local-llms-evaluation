package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedLastCharIsWhitespace_LastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacters {

    @Test
    public void lastCharIsWhitespace_LastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacters() {
        // Arrange
        StringBuilder sb = new StringBuilder("Hello");

        // Act & Assert
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}