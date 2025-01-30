package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        assertEquals(doc.location(), "http://example.com");
    }

}