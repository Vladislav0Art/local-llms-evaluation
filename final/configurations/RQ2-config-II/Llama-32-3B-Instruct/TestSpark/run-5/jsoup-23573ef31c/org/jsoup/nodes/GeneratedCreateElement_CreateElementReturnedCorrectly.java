package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedCreateElement_CreateElementReturnedCorrectly {

    @Test
    public void createElement_CreateElementReturnedCorrectly() {
        // Given
        String tagName = "div";
        Element element = new Tag(tagName);

        // When
        Document document = new Document("https://www.example.com");
        Element createdElement = document.createElement(tagName);

        // Then
        assertEquals(element, createdElement);
    }

}