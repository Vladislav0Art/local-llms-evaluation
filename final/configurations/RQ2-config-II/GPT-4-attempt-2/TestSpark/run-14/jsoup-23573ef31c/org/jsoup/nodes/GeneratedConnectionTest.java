package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Connection mockedConnection = mock(Connection.class);
        Document document = new Document("http://baseUri.com");
        document.connection(mockedConnection);
        assertEquals(mockedConnection, document.connection());
    }

}