package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedForms_RetrievesFormsElements {

    @Test
    public void forms_RetrievesFormsElements() {
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

}