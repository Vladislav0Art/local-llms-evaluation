package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.body());
    }

}