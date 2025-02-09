package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document doc = new Document("http://google.com");
        Connection conn = doc.connection();
        assertNotNull(conn);
    }

}