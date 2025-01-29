package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedIsBlank_test {

    @Test
    public void isBlank_test() {
        // Arrange
        String text = "";

        // Act
        TextNode node = new TextNode(text);
        boolean result = node.isBlank();

        // Assert
        assertTrue(result);
    }

}