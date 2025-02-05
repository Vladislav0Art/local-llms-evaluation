package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        String baseUri = "http://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document doc = new Document(baseUri);
        doc.connection(connection);
        assertEquals(connection, doc.connection());
    }

}