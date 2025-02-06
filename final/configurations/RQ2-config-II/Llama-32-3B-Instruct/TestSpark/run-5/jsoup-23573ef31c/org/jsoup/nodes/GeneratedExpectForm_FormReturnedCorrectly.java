package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedExpectForm_FormReturnedCorrectly {

    @Test
    public void expectForm_FormReturnedCorrectly() {
        // Given
        String cssQuery = "div";
        FormElement formElement = new Tag(cssQuery);

        // When
        Document document = new Document("https://www.example.com");
        FormElement expectedForm = document.expectForm(cssQuery);

        // Then
        assertEquals(formElement, expectedForm);
    }

}