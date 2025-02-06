package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTextElementMethodTest {

    @Test
    public void textElementMethodTest() {
        Document document = new Document("http://example.com");
        Element element = document.text("Hello World!");
        assertNotNull(element);
    }

}