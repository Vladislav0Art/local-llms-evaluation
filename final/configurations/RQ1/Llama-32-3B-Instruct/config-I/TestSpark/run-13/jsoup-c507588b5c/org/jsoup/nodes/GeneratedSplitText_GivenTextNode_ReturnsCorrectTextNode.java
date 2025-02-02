package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitText_GivenTextNode_ReturnsCorrectTextNode {

    @Test
    public void splitText_GivenTextNode_ReturnsCorrectTextNode() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World!", tailNode.text());
    }

}