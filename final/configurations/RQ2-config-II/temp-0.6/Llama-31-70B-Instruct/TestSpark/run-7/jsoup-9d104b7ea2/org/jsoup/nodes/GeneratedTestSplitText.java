package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        TextNode result = textNode.splitText(2);

        // Assert
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", result.getWholeText());
    }

}