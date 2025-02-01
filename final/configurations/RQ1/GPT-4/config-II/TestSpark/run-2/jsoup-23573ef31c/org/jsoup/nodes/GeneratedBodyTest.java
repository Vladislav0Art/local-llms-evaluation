package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBodyTest {

    private final static Charset UTF_CHARSET = StandardCharsets.UTF_8;
    private final static String BASE_URI = "http://example.org";

    @Test
    public void bodyTest() {
        Document document = new Document(BASE_URI);
        Element body = document.prependElement("body");
        assertEquals(body, document.body());
    }

}