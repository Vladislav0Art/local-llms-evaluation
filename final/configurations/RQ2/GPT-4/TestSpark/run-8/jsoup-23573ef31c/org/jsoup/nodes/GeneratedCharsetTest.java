package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("https://example.com");
        doc.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), doc.charset());
    }

}