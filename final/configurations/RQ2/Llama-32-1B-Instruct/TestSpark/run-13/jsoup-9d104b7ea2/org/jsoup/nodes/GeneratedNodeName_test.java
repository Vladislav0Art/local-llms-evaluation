package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        // Arrange
        String text = "Hello World";
        NodeResult nodeResult = createTextNode(text);

        // Act
        String nodeName = nodeResult.nodeName();

        // Assert
        assertEquals("text", nodeName);
    }

}