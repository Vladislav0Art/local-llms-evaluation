package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_GivenBlankTextNode_ReturnsBlankString {

    @Test
    public void getWholeText_GivenBlankTextNode_ReturnsBlankString() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertTrue(wholeText.isEmpty());
    }

}