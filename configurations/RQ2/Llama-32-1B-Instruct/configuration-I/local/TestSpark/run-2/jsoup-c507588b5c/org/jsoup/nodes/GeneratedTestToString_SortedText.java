package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeClone;

public class GeneratedTestToString_SortedText {

    @Test
    public void testToString_SortedText() {
        // Arrange
        String text = "Worldello H";

        // Act
        String result = TextNode.toString(text);

        // Assert
        assertTrue(result.equals("H Worldello"));
    }

}