package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedLastCharIsWhitespaceStringBuilderGivenEmptyStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespaceStringBuilderGivenEmptyStringBuilder_ReturnsTrue() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(isLastCharWhitespace);
    }

}