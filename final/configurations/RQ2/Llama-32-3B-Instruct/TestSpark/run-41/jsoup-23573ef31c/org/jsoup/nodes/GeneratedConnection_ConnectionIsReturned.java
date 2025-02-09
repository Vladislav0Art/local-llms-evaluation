package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedConnection_ConnectionIsReturned {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private OutputSettings outputSettings;

    @Test
    public void connection_ConnectionIsReturned() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
        when(connection.toString()).thenReturn("Connection to http://example.com");
        String connectionStr = connection.toString();
        assertEquals("Connection to http://example.com", connectionStr);
    }

}