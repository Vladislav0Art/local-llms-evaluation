package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest lastCharIsWhitespace {

    @Test
    public void test

    lastCharIsWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello");

        // Act
        boolean result = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(result);
    }

}