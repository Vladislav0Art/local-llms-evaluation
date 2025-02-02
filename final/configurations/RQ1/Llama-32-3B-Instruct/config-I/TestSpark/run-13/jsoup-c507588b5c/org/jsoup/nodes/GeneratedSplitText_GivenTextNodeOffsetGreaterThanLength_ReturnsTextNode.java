package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitText_GivenTextNodeOffsetGreaterThanLength_ReturnsTextNode {

    @Test
    public void splitText_GivenTextNodeOffsetGreaterThanLength_ReturnsTextNode() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        TextNode tailNode = textNode.splitText(7);
        assertNotNull(tailNode);
    }

}