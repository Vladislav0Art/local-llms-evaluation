package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Arrange
        String text = "   Hello World";
        TextNode node = new TextNode(text);

        // Act
        boolean result = node.isBlank();

        // Assert
        assertTrue(result);
    }

}