package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeClone;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        // Arrange
        String text = "";

        // Act
        TextNode textNode = new TextNode(text).clone();

        // Assert
        assertTrue(TextNode.isBlank(text));
    }

}