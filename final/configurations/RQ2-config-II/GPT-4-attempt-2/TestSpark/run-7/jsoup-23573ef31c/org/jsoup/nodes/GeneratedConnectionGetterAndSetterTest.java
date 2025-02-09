package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConnectionGetterAndSetterTest {

    // Test constructor

    @Test
    public void connectionGetterAndSetterTest() {
        Document document = new Document("http://localhost");
        Connection connection = Jsoup.connect("http://localhost");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}