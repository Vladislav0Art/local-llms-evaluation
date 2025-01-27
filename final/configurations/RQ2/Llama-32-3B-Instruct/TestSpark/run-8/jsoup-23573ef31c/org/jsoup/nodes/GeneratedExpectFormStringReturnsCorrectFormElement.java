package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedExpectFormStringReturnsCorrectFormElement {

    @Test
    public void expectFormStringReturnsCorrectFormElement() {
        String cssQuery = "input[type=\"text\"]";
        FormElement formElement = new FormElement();
        Document document = new Document("http://example.com");
        FormElement result = document.expectForm(cssQuery, formElements);
        assertNotNull(result);
        assertEquals(formElement, result);
    }

}