package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedSplitTextOffsetNonZero {

    @Test
    public void splitTextOffsetNonZero() {
        // Arrange
        TextNode node = Mockito.mock(TextNode.class);
        when(node.text()).thenReturn("abcdefg");
        String expected = "abc";

        // Act
        TextNode newNode = node.splitText(3);

        // Assert
        assertEquals(expected, newNode.text());
    }

}