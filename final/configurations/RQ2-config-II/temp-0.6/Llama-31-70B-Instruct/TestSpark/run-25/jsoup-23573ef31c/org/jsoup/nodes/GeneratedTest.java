package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("www.example.com");
        assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = Document.createShell("www.example.com");
        assertEquals("www.example.com", document.location());
    }

    @Test
    public void documentTypeTest() {
        Document document = Document.createShell("www.example.com");
        DocumentType documentType = mock(DocumentType.class);
        when(document.documentType()).thenReturn(documentType);
        assertEquals(documentType, document.documentType());
    }

    @Test
    public void headTest() {
        Document document = Document.createShell("www.example.com");
        Element head = mock(Element.class);
        when(document.head()).thenReturn(head);
        assertEquals(head, document.head());
    }

    @Test
    public void bodyTest() {
        Document document = Document.createShell("www.example.com");
        Element body = mock(Element.class);
        when(document.body()).thenReturn(body);
        assertEquals(body, document.body());
    }

    @Test
    public void formsTest() {
        Document document = Document.createShell("www.example.com");
        List<FormElement> forms = mock(ArrayList.class);
        when(document.forms()).thenReturn(forms);
        assertEquals(forms, document.forms());
    }

}