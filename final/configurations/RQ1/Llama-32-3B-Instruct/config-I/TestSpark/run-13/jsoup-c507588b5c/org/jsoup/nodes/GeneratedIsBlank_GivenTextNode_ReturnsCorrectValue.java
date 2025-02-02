package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsBlank_GivenTextNode_ReturnsCorrectValue {

    @Test
    public void isBlank_GivenTextNode_ReturnsCorrectValue() {
        // Arrange
        String text = "   ";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        assertTrue(textNode.isBlank());
    }

}