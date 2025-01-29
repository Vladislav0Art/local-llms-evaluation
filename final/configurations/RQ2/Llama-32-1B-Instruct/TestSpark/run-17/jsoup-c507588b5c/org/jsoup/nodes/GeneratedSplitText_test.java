package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitText_test {

    @Test
    public void splitText_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals(3, node splitText(1));
    }

}