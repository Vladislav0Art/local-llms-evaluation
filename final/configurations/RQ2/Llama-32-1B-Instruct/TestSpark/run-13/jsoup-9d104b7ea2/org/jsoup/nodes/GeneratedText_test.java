package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedText_test {

    @Test
    public void text_test() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode node = new TextNode(text);

        // Assert
        assertEquals(text, node.text());
    }

}