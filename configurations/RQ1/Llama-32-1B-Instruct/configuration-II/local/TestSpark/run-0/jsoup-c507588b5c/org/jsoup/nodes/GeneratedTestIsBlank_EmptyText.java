package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestIsBlank_EmptyText {

    @Test
    public void testIsBlank_EmptyText() {
        // Arrange
        String text = "";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertTrue(result.isBlank());
    }

}