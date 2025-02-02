package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTextNode_GivenBlankText_ReturnsBlankTextNode {

    @Test
    public void createTextNode_GivenBlankText_ReturnsBlankTextNode() {
        // Arrange
        String blankText = "";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);

        // Act
        TextNode textNode = TextNode.createFromEncoded(blankText);
        // Assert
        assertTrue(textNode.isBlank());
    }

}