package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedLastCharIsWhitespace_test {

    @Test
    public void lastCharIsWhitespace_test() {
        // Arrange
        String text = "   Hello   ";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello", node lastCharIsWhitespace(new StringBuilder()));

        // Assert
        verify(accum, never()).append("false");
    }

}