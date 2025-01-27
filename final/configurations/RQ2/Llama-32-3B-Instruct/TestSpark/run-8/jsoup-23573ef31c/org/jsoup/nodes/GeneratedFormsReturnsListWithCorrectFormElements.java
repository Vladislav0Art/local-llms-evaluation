package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedFormsReturnsListWithCorrectFormElements {

    @Test
    public void formsReturnsListWithCorrectFormElements() {
        List<FormElement> formElements = new ArrayList<>();
        formElements.add(new FormElement());
        Document document = new Document("http://example.com");
        List<FormElement> result = document.forms(formElements);
        assertEquals(formElements, result);
    }

}