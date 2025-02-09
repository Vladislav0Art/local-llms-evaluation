package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectionSetterTest {

    @Test
    public void connectionSetterTest() {
        Document document = new Document("http://example.com");
        Connection connection = new Connection("http://another.com");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}