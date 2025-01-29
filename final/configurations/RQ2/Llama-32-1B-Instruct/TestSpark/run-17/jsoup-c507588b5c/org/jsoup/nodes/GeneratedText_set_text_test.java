package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedText_set_text_test {

    @Test
    public void text_set_text_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node text());
        node = TextNode.textSetText("New Value");
        assertEquals("Hello World New Value", node text());

        // Assert
        verify(accum, never()).append("Hello World");
    }

}