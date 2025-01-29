package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_test {

    @Test
    public void isBlank_test() {
        // Arrange
        String text = "Hello";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals(false, node isBlank());

        // Assert
        verify(accum, never()).append("false");
    }

}