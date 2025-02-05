package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = new Document("http://test.com");
        document.connection(connection);
        assertSame(connection, document.connection());
    }

}