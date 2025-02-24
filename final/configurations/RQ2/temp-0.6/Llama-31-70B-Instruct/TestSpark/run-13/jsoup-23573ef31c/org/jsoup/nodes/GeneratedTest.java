package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
        assertEquals("http://example.com", document.location());
        assertEquals("", document.html());
    }

    @Test
    public void createShellNullBaseUriTest() {
        Document document = Document.createShell(null);
        assertNotNull(document);
        assertEquals("", document.location());
        assertEquals("", document.html());
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void locationNullTest() {
        Document document = new Document(null);
        assertEquals("", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        Connection connection = mock(Connection.class);
        document.connection(connection);
        assertSame(connection, document.connection());
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

}