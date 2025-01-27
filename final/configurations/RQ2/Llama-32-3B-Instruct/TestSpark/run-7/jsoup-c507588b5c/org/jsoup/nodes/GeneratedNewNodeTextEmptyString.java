package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedNewNodeTextEmptyString {

    @Test
    public void newNodeTextEmptyString() {
        // Arrange
        String text = "";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertEquals("", node.text());
        assertFalse(node.isBlank());
    }

}