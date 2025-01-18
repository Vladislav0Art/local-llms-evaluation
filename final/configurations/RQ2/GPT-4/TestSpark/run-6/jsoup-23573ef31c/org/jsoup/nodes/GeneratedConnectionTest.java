package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Connection connection = mock(Connection.class);
        Document doc = new Document("https://example.com");
        doc = doc.connection(connection);
        assertNotNull(doc.connection());
    }

}