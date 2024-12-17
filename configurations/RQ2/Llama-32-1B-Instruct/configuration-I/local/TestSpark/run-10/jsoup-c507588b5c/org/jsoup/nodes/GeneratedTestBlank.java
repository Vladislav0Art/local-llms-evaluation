package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestBlank {

    public static Document createTextNode(String text) {
        return new Document();
    }

    @Test
    public void TestBlank() {
        // Arrange
        String text = "";

        // Act
        TextNode textNode = new TextNode(text);

        // Assert
        assertTrue(TextNode.isBlank(textNode));
    }

}