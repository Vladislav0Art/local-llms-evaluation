package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestToString_EmptyText {

    @Test
    public void testToString_EmptyText() {
        // Arrange
        String text = "";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.toString());
    }

}