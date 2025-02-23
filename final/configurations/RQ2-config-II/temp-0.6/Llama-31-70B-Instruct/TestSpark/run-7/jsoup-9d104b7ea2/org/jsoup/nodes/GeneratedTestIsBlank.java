package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertTrue(result);
    }

}