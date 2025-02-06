package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedExpectForm_expectFormMethodReturnsCorrectFormElement {

    @Test
    public void expectForm_expectFormMethodReturnsCorrectFormElement() {
        String expectedCssQuery = "form";
        List<FormElement> forms = Arrays.asList(new FormElement(), new FormElement());
        Document document = Document.createShell("https://www.example.com");
        assertEquals(forms.get(0), document.expectForm(expectedCssQuery));
    }

}