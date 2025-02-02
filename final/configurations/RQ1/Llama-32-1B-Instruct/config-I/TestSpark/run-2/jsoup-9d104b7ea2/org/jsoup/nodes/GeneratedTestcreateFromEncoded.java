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

public class GeneratedTestcreateFromEncoded {

    @Mock
    private Document document;

    @Test
    public void testcreateFromEncoded() {
        // Given
        String encodedText = "Hello World";
        Document document = new Document();
        Element element = document.createElement("p");
        element.setTextContent(encodedText);

        // When
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Then
        assert !node.isBlank();
    }

}