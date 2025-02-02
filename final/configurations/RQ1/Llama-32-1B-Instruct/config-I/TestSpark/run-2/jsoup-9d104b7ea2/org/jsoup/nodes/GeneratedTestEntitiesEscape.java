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

public class GeneratedTestEntitiesEscape {

    @Mock
    private Document document;

    @Test
    public void testEntitiesEscape() {
        // Given
        Document document = new Document();

        // When
        String text = "<test>";
        Element element = document.createElement("span");
        element.setTextContent(text);
        TextNode node = new TextNode(document, element);

        // Then
        assert !node.isBlank();
    }

}