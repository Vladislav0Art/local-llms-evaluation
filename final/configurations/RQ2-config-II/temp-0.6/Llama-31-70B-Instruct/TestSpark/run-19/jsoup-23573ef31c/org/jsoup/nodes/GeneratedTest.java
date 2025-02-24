package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.QuirksMode;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void createShellTest() throws IOException {
        String baseUri = "https://www.jsoup.org/";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
        assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void locationTest() {
        String baseUri = "https://www.jsoup.org/";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void connectionTest() {
        String baseUri = "https://www.jsoup.org/";
        Document document = Document.createShell(baseUri);
        Connection connection = document.connection();
        assertNotNull(connection);
        assertEquals(baseUri, connection.url());
    }

    @Test
    public void documentTypeTest() {
        String baseUri = "https://www.jsoup.org/";
        Document document = Document.createShell(baseUri);
        DocumentType documentType = mock(DocumentType.class);
        document.setDocumentType(documentType);
        assertEquals(documentType, document.documentType());
    }

}