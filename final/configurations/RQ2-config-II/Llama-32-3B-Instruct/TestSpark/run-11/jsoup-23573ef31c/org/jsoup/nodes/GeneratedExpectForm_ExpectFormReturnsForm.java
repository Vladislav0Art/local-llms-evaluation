package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedExpectForm_ExpectFormReturnsForm {

    @Test
    public void expectForm_ExpectFormReturnsForm() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        FormElement form = document.expectForm("form");
        assertNotNull(form);
        assertTrue(form instanceof Element);
    }

}