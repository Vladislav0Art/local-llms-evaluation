package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = new Document("http://localhost");
        Element body = document.body();
        assertNotNull(body);
    }

}