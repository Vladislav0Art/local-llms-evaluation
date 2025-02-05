package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedConnectionInjectionTest {

    @Test
    public void connectionInjectionTest() {
        Document doc = new Document("http://example.com");
        Connection connection = Connection.connect("http://example2.com");
        doc.connection(connection);
        assertEquals(connection, doc.connection());
    }

}