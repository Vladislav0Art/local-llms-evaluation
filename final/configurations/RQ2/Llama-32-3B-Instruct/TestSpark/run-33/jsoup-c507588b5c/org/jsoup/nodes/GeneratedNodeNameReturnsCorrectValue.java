package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeNameReturnsCorrectValue {

    @Test
    public void nodeNameReturnsCorrectValue() {
        // Arrange and Act
        TextNode textNode = new TextNode("Example Node");
        String result = textNode.nodeName();

        // Assert
        assertEquals("text_node", result);
    }

}