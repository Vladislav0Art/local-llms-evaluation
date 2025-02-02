package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtml_GivenTextNode_ReturnsCorrectString {

    @Test
    public void outerHtml_GivenTextNode_ReturnsCorrectString() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        StringBuilder result = new StringBuilder();
        textNode.outerHtmlHead(result, 0, document.outputSettings());
        assertEquals("<p>Hello, World!</p>", result.toString());
    }

}