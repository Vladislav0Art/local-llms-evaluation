package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        assertEquals("body", body.nodeName());
    }

}