package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespaceShouldReturnLastCharAsWhitespaceIfPresent {

    @Test
    public void lastCharIsWhitespaceShouldReturnLastCharAsWhitespaceIfPresent() {
        // Given
        StringBuilder sb = new StringBuilder("Hello");
        String lastChar = TextNode.lastCharIsWhitespace(sb).toString();

        // Then
        Mockito.verify(lastChar).equals(Mockito.any(Whitespace.class));
    }

}