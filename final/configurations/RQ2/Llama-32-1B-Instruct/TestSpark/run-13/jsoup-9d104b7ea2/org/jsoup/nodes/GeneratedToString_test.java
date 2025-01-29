package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedToString_test {

    @Test
    public void toString_test() {
        // Arrange
        String text = "Hello World";

        // Act
        String result = new TextNode(text).toString();

        // Assert
        assertEquals("Hello World", result);
    }

}