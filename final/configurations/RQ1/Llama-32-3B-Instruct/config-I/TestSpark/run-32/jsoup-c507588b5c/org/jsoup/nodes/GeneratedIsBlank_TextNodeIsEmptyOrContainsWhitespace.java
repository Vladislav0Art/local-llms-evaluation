package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlank_TextNodeIsEmptyOrContainsWhitespace {

    @Test
    public void isBlank_TextNodeIsEmptyOrContainsWhitespace() {
        // Given
        String text = "   ";
        String encodedText = "&lt;&gt;&amp;&quot;&#39;&apos;&";

        TextNode textNode = new TextNode(text);
        TextNode encodedTextNode = TextNode.createFromEncoded(encodedText);

        // When
        boolean isBlank = textNode.isBlank();
        boolean isEncodedBlank = encodedTextNode.isBlank();

        // Then
        assertTrue(isBlank);
        assertTrue(isEncodedBlank);
    }

}