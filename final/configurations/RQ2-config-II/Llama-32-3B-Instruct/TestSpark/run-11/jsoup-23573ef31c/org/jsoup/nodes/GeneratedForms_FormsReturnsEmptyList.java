package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedForms_FormsReturnsEmptyList {

    @Test
    public void forms_FormsReturnsEmptyList() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

}