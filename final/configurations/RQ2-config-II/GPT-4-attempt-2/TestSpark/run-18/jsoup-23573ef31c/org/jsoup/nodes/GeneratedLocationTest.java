package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}