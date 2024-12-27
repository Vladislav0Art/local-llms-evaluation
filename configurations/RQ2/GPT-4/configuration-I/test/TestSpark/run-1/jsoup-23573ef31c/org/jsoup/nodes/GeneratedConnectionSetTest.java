package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConnectionSetTest {

    @Test
    public void connectionSetTest() {
        Document document = new Document("http://baseUri");
        Connection connection = Mockito.mock(Connection.class);
        document = document.connection(connection);
        assertEquals(connection, document.connection());
    }

}