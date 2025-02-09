package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        String baseUri = "https://test.com";
        Document doc = new Document(baseUri);
        assertEquals(baseUri, doc.location());
    }

}