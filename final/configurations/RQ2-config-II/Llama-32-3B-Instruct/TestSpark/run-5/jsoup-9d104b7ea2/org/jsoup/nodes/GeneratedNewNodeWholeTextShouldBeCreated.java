package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeWholeTextShouldBeCreated {

    @Test
    public void newNodeWholeTextShouldBeCreated() {
        // Given
        TextNode textNode = new TextNode("Hello, World!");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        Mockito.verify(StringBuilder.class).append("Hello, World!");
    }

}