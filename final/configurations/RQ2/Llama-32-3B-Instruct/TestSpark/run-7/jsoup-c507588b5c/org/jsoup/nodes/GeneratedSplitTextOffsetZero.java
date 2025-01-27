package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedSplitTextOffsetZero {

    @Test
    public void splitTextOffsetZero() {
        // Arrange
        TextNode node = Mockito.mock(TextNode.class);
        when(node.text()).thenReturn("abcdefg");

        // Act
        TextNode newNode = node.splitText(0);

        // Assert
        assertSame(newNode, node);
    }

}