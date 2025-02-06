package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewNodeTextShouldBeCreated {

    @Test
    public void newNodeTextShouldBeCreated() {
        // Given
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);

        // When
        String nodeValue = textNode.text();

        // Then
        Mockito.verify(StringUtil.class).normalizeWhitespace(text);
        Mockito.verify(TextNode.class, Mockito.times(1)).text(text);
    }

}