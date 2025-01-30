package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        assertEquals(body.tagName(), "body");
    }

}