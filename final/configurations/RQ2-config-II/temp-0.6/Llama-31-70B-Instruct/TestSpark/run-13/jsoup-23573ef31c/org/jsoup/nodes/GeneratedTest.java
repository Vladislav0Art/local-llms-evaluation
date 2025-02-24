package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.DocumentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTest {

    @Test
    public void locationTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void connectionTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.documentType());
    }

    @Test
    public void headTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element head = document.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

    @Test
    public void bodyTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element body = document.body();
        assertNotNull(body);
        assertEquals("body", body.nodeName());
    }

    @Test
    public void formsTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

}