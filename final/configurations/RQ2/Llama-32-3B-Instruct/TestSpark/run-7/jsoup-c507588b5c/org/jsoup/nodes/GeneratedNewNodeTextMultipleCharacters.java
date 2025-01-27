package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedNewNodeTextMultipleCharacters {

    @Test
    public void newNodeTextMultipleCharacters() {
        // Arrange
        String text = "abc";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertEquals("abc", node.text());
        assertFalse(node.isBlank());
    }

}