package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Parser parser;

    @InjectMocks
    private Document document;

    @Test
    public void testLocation() {
        document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void testLocationUnknown() {
        document = new Document("");
        assertEquals("", document.location());
    }

    @Test
    public void testConnection() {
        Connection connection = Jsoup.newSession();
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

    @Test
    public void testConnectionNull() {
        assertNull(document.connection());
    }

    @Test
    public void testDocumentType() {
        Element documentType = new Element(Tag.valueOf("document", "http://example.com"));
        document.appendChild(documentType);
        assertEquals(documentType, document.documentType());
    }

    @Test
    public void testDocumentTypeNull() {
        assertNull(document.documentType());
    }

    @Test
    public void testHtmlElement() {
        document = new Document("http://example.com");
        Element html = document.html();
        assertNotNull(html);
    }

    @Test
    public void testHtmlElementNoHtml() {
        document = new Document("http://example.com");
        Element html = document.html();
        assertNotNull(html);
    }

    @Test
    public void testHead() {
        document = new Document("http://example.com");
        Element head = document.head();
        assertNotNull(head);
    }

    @Test
    public void testHeadNoHtml() {
        document = new Document("http://example.com");
        Element head = document.head();
        assertNotNull(head);
    }

}