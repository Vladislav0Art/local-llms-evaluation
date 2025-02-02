package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWholeText_GivenTextNode_ReturnsCorrectText {

    @Test
    public void getWholeText_GivenTextNode_ReturnsCorrectText() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        assertEquals(text, textNode.getWholeText());
    }

}