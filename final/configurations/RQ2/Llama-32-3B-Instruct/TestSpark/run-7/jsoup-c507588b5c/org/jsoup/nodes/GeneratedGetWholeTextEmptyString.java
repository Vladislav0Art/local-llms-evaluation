package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedGetWholeTextEmptyString {

    @Test
    public void getWholeTextEmptyString() {
        // Arrange
        TextNode node = new TextNode("");

        // Act & Assert
        assertEquals("", node.getWholeText());
    }

}