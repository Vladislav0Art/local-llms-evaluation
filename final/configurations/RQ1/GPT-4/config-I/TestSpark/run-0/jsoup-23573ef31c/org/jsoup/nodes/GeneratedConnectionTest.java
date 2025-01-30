package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Connection connection = mock(Connection.class);
        Document doc = new Document("");
        doc.connection(connection);
        assertSame(connection, doc.connection());
    }

}