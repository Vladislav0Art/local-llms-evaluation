package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("https://example.com");
        doc.charset(java.nio.charset.StandardCharsets.UTF_8);
        assertEquals(java.nio.charset.StandardCharsets.UTF_8, doc.charset());
    }

}