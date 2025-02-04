package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class Generated[TextNode_create][Scenario]

_Test {

    @BeforeClass
    public static void init () {
        // Initialize mocks
        Document document = new Document();
        Node node = new Node();
        TextNode textNode = new TextNode("Hello World");

        Mockito.when(textNode.getWholeText()).thenReturn("Hello World");
        Mockito.when(textNode.coreValue()).thenReturn("Hello World");
        Mockito.when(document.nodeName()).thenReturn("#text");
    }

    @Test
    public void [TextNode_create][Scenario]_Test() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");

        // Act & Assert
        String actualText = textNode.text();
        assert (actualText.equals("Hello World"));
    }

}