package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedCreateFormElementFormSelectorCreation {

    @Test
    public void createFormElementFormSelectorCreation() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = Document.createShell(connection.getUri());
        String cssQuery = "form";
        FormElement form = document.forms().get(0);
        assertNotNull(form);
        assertEquals(cssQuery, form.getSelector());
    }

}