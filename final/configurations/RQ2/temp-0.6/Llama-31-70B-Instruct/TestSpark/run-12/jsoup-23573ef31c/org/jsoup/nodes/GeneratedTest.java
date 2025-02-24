package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void shouldCreateShellWithBaseUri() {
        Document document = Document.createShell("www.example.com");
        assertNotNull(document);
        assertEquals("www.example.com", document.baseUri());
    }

    @Test
    public void shouldReturnLocation() {
        Document document = Document.createShell("www.example.com");
        Connection connection = mock(Connection.class);
        when(connection.url()).thenReturn("www.example.com");
        document.connection(connection);
        assertEquals("www.example.com", document.location());
    }

    @Test
    public void shouldReturnNullDocumentType() {
        Document document = Document.createShell("www.example.com");
        assertNull(document.documentType());
    }

    @Test
    public void shouldReturnHead() {
        Document document = Document.createShell("www.example.com");
        Element head = document.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    @Test
    public void shouldReturnBody() {
        Document document = Document.createShell("www.example.com");
        Element body = document.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

}