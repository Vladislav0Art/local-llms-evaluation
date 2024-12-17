package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTestTextNodeCreation {

    @Test
    public void testTextNodeCreation() {
        // Arrange
        // No need to arrange as the creation is straightforward
        TextNode textNode = new TextNode("World");

        // Act
        assertNotNull(textNode);

        // Assert
        assertEquals("#text", textNode.nodeName());
        assertEquals("World", textNode.text());
    }

}