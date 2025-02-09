package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        doc.charset(StandardCharsets.UTF_8);

        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

}