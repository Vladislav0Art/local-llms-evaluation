package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        assertEquals(baseUri, doc.location());
    }

}