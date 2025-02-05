package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConnectionValidTest {

    @Test
    public void connectionValidTest() {
        Document document = new Document("");
        Connection mockedConnection = Mockito.mock(Connection.class);
        document.connection(mockedConnection);
        assertEquals(mockedConnection, document.connection());
    }

}