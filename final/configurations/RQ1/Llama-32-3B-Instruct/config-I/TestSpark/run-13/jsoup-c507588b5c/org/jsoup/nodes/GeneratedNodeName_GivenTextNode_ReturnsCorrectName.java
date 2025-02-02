package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectName {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        assertEquals("#text", textNode.nodeName());
    }

}