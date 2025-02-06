package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConnectionShouldReturnConnection {

    @Test
    public void connectionShouldReturnConnection() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = new Document("http://example.com");
        Document result = document.connection();
        assertTrue(result instanceof Document);
        assertEquals(connection, result);
    }

}