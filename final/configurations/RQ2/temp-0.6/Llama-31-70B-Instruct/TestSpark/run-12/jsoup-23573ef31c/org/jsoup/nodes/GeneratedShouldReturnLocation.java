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

public class GeneratedShouldReturnLocation {

    @Test
    public void shouldReturnLocation() {
        Document document = Document.createShell("www.example.com");
        Connection connection = mock(Connection.class);
        when(connection.url()).thenReturn("www.example.com");
        document.connection(connection);
        assertEquals("www.example.com", document.location());
    }

}