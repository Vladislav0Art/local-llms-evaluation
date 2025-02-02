package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestSplitText {

    @Mock
    private Document document;

    @Test
    public void testSplitText() {
        // Given
        Document document = new Document();
        Element element = document.createElement("p");
        element.setTextContent("Hello World");

        // When
        TextNode firstNode = new TextNode(document, element);
        TextNode secondNode = firstNode.splitText(6);

        // Then
        assert !firstNode.isBlank();
        assert !secondNode.isBlank();
    }

}