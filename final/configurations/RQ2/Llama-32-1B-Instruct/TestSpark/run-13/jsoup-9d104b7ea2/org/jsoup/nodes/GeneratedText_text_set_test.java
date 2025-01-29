package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedText_text_set_test {

    @Test
    public void text_text_set_test() {
        // Arrange
        String text = "Hello World";
        TextNode node = new TextNode(text);
        node.setText("Goodbye World");

        // Act
        String result = node.text();

        // Assert
        assertEquals("Goodbye World", result);
    }

}