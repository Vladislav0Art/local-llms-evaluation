package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void locationTest() {
        Document document = new Document("http://www.example.com");
        assertEquals("http://www.example.com", document.location());
    }

}