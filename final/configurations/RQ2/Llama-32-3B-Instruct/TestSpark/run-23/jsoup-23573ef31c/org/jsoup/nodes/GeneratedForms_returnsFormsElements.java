package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedForms_returnsFormsElements {

    @Test
    public void forms_returnsFormsElements() {
        Connection connection = Jsoup.connect("https://example.com/form");
        Document document = Document.createShell(connection.url());
        List<FormElement> formsElements = document.forms();
        assertTrue(formsElements instanceof org.jsoup.nodes.Document);
    }

}