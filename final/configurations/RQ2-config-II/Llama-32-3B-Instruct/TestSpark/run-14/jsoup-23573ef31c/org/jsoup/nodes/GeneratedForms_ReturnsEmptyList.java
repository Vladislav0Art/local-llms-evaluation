package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedForms_ReturnsEmptyList {

    @Test
    public void forms_ReturnsEmptyList() {
        Document document = Document.createShell("");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

}