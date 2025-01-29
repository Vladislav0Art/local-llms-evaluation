package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest createFromEncoded {

    @Test
    public void test

    createFromEncoded() {
        // Arrange
        String encodedText = "Hello World";

        // Act
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Assert
        assertNotNull(textNode);
        assertEquals("Hello World", textNode.getText());
    }

}