package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCharsetManipulationTest {

    @Test
    public void charsetManipulationTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.UTF_8);
        assertEquals(Charset.forName("UTF-8"), doc.charset());
    }

}