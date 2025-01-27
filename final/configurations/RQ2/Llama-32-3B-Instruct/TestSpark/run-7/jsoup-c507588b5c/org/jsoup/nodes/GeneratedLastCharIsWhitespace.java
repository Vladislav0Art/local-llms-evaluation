package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespace {

    @Test
    public void lastCharIsWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder("abc ");
        when(sb.length()).thenReturn(4);

        // Act
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}