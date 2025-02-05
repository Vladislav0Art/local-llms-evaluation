package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConnectionSetAndGetTest {

    @Test
    public void connectionSetAndGetTest() {
        Document doc = new Document("http://test.com");
        Connection connection = mock(Connection.class);
        doc.connection(connection);
        assertEquals(connection, doc.connection());
    }

}