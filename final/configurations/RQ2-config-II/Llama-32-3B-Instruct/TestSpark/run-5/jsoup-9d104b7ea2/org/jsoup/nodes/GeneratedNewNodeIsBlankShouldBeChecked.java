package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeIsBlankShouldBeChecked {

    @Test
    public void newNodeIsBlankShouldBeChecked() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isBlank = textNode.isBlank();

        // Then
        Mockito verifies (isBlank(), Mockito.once()).withValue(true);
    }

}