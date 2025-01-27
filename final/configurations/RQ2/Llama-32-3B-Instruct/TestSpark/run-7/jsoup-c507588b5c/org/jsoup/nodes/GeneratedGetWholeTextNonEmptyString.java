package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedGetWholeTextNonEmptyString {

    @Test
    public void getWholeTextNonEmptyString() {
        // Arrange
        TextNode node = new TextNode("abc");

        // Act & Assert
        assertEquals("abc", node.getWholeText());
    }

}