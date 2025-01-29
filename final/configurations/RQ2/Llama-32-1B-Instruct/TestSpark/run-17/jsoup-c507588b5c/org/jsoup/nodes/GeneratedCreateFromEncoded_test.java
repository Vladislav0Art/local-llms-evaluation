package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncoded_test {

    @Test
    public void createFromEncoded_test() {
        // Arrange
        String encodedText = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Assert
        verify(accum, never()).append("Hello World");
    }

}