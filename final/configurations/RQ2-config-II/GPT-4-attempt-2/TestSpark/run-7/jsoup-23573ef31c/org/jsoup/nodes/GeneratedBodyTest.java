package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedBodyTest {

    // Test constructor

    @Test
    public void bodyTest() {
        Document document = new Document("http://localhost");
        Element body = document.body();
        assertNotNull(body);
    }

}