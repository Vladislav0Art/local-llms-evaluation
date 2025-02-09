package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedFormsReturnsEmptyList DocumentNoForms {

    @Test
    public void formsReturnsEmptyList

    DocumentNoForms() {
        Document document = new Document("https://example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

}