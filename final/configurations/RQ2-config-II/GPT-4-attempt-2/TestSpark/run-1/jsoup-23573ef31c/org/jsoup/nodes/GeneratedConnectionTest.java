package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document doc = new Document("");
        Connection mockConnection = mock(Connection.class);
        Document dc = doc.connection(mockConnection);
        assertNotNull(dc);
    }

}