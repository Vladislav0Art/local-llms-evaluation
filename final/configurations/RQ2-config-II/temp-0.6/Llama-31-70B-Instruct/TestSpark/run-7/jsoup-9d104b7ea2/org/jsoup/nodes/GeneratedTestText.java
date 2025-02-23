package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText {

    @Test
    public void testText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String result = textNode.text();

        // Assert
        assertEquals("test", result);
    }

}