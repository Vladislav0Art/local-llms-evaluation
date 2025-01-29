package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest toString {

    @Test
    public void test

    toString() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        String result = textNode.toString();

        // Assert
        assertNotNull(result);
        assertEquals("Hello World", result);
    }

}