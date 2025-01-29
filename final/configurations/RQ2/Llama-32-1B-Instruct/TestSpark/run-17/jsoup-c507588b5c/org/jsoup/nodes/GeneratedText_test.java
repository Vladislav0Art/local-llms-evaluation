package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedText_test {

    @Test
    public void text_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node text());

        // Assert
        verify(accum, never()).append("Hello World");
    }

}