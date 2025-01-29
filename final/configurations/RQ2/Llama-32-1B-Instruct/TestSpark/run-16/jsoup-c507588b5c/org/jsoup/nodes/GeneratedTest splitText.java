package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest splitText {

    @Test
    public void test

    splitText() {
        // Arrange
        int offset = 5;
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);

        // Assert
        assertNotNull(result);
        assertEquals("Hello", result.getText());
    }

}