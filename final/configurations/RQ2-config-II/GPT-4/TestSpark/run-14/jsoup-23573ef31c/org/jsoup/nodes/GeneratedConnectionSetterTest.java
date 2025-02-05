package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedConnectionSetterTest {

    @Test
    public void connectionSetterTest() {
        Document document = new Document("http://example.com");
        Connection connection = mock(Connection.class);
        document.connection(connection);
        assertSame(connection, document.connection());
    }

}