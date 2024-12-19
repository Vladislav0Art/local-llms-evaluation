package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeClone;

public class GeneratedTestClone_CloningToSameDocument {

    @Test
    public void testClone_CloningToSameDocument() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode1 = new TextNode(text).clone();

        // Assert
        assertEquals(text, textNode1.text());
    }

}