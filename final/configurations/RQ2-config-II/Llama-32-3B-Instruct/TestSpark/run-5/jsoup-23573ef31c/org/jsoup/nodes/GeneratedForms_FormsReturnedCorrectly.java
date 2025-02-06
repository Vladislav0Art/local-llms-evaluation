package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedForms_FormsReturnedCorrectly {

    @Test
    public void forms_FormsReturnedCorrectly() {
        // Given
        List<FormElement> formElements = new ArrayList<>();

        // When
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();

        // Then
        assertEquals(formElements, forms);
    }

}