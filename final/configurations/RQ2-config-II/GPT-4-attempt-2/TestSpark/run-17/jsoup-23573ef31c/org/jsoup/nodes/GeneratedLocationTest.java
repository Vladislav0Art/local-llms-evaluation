package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document doc = new Document("http://google.com");
        assertEquals("http://google.com", doc.location());
    }

}