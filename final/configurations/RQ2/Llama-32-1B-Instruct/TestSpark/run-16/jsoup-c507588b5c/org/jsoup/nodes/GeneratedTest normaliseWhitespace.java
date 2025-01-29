package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest normaliseWhitespace {

    @Test
    public void test

    normaliseWhitespace() {
        // Arrange
        String text = "   Hello World  ";

        // Act
        String result = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals("Hello World", result);
    }

}