package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedSplitText_test {

    @Test
    public void splitText_test() {
        // Arrange
        String text = "Hello World";
        int offset = 5;
        NodeResult nodeResult = createTextNode(text);

        // Act
        TextNode subNode = nodeResult.splitText(offset);

        // Assert
        assertEquals("World", subNode.text());
    }

}