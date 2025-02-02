package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitText_GivenTextNodeOffsetNegative_ThrowsException {

    @Test
    public void splitText_GivenTextNodeOffsetNegative_ThrowsException() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        textNode.splitText(-1);
    }

}