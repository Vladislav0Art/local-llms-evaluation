package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeNodeNameShouldBeCreated {

    @Test
    public void newNodeNodeNameShouldBeCreated() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String nodeName = textNode.nodeName();

        // Then
        Mockito verifies (document().nodeName(), Mockito.once());
    }

}