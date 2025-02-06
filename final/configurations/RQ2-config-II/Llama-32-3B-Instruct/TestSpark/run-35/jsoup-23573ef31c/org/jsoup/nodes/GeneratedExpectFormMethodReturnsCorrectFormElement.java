package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedExpectFormMethodReturnsCorrectFormElement {

    @Test
    public void expectFormMethodReturnsCorrectFormElement() {
        String cssQuery = "#form";
        List<FormElement> forms = new ArrayList<>();
        FormElement formElement = new FormElement();
        forms.add(formElement);
        Document document = new Document();
        assertEquals(formElement, document.expectForm(cssQuery));
    }

}