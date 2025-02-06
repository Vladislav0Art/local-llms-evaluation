package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespaceShouldStripLeadingWhitespace {

    @Test
    public void stripLeadingWhitespaceShouldStripLeadingWhitespace() {
        // Given
        String text = "   Hello, World!";

        // When
        String strippedText = TextNode.stripLeadingWhitespace(text);

        // Then
        Mockito.verify(strippedText).toString().withValue("Hello, World!");
    }

}