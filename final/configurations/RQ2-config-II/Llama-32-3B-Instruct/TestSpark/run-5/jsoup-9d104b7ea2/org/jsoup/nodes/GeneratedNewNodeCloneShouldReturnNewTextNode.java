package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeCloneShouldReturnNewTextNode {

    @Test
    public void newNodeCloneShouldReturnNewTextNode() {
        // Given
        TextNode textNode = new TextNode("Hello, World!");

        // When
        TextNode clone = textNode.clone();

        // Then
        Mockito.verify(clone).text(Mockito.anyString());
    }

}