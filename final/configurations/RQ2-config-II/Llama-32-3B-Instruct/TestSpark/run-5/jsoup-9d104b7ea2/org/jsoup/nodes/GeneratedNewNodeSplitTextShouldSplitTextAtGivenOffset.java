package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeSplitTextShouldSplitTextAtGivenOffset {

    @Test
    public void newNodeSplitTextShouldSplitTextAtGivenOffset() {
        // Given
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);

        // When
        int offset = 5;
        String splitText = textNode.splitText(offset);

        // Then
        Mockito.verify(StringBuilder.class).append("World!");
    }

}