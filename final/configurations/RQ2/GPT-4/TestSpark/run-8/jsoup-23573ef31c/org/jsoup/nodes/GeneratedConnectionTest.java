package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document doc = new Document("https://example.com");
        Connection mockConnection = mock(Connection.class);
        Document docWithConnection = doc.connection(mockConnection);
        assertEquals(mockConnection, docWithConnection.connection());
    }

}