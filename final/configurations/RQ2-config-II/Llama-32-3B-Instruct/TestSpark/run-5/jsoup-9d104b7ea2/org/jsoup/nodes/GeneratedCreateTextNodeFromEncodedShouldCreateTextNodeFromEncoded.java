package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNodeFromEncodedShouldCreateTextNodeFromEncoded {

    @Test
    public void createTextNodeFromEncodedShouldCreateTextNodeFromEncoded() {
        // Given
        String encodedText = "Hello, World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // When
        String decodedText = textNode.text();

        // Then
        Mockito.verify(StringUtil.class).normalizeWhitespace(decodedText);
    }

}