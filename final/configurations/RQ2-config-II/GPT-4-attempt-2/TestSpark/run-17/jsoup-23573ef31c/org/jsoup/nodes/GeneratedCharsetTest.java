package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://google.com");
        doc.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

}