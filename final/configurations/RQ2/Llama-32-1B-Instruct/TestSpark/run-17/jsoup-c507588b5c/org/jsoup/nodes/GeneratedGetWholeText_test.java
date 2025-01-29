package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeText_test {

    @Test
    public void getWholeText_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node getWholeText());

        // Assert
        verify(accum, never()).append("Hello World");
    }

}