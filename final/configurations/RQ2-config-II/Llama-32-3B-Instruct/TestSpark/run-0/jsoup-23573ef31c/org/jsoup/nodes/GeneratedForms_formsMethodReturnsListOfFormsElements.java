package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedForms_formsMethodReturnsListOfFormsElements {

    @Test
    public void forms_formsMethodReturnsListOfFormsElements() {
        List<FormElement> expectedForms = Arrays.asList(new FormElement(), new FormElement());
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedForms, document.forms());
    }

}