package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("https://example.com");
        Assert.assertEquals("https://example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = Mockito.mock(Document.class);
        Connection connection = Mockito.mock(Connection.class);
        when(document.connection()).thenReturn(connection);
        Assert.assertEquals(connection, document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = Mockito.mock(Document.class);
        DocumentType documentType = Mockito.mock(DocumentType.class);
        when(document.documentType()).thenReturn(documentType);
        Assert.assertEquals(documentType, document.documentType());
    }

    @Test
    public void headTest() {
        Document document = Mockito.mock(Document.class);
        Element element = Mockito.mock(Element.class);
        when(document.head()).thenReturn(element);
        Assert.assertEquals(element, document.head());
    }

}