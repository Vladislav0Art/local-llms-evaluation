package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetTextNodeName_GivenTextNode_ReturnsCorrectName {

    @Test
    public void getTextNodeName_GivenTextNode_ReturnsCorrectName() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String nodeName = textNode.nodeName();

        // Then
        assertEquals("#text", nodeName);
    }

}