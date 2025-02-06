package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCreateElementMethodTest {

    @Test
    public void createElementMethodTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("p");
        assertNotNull(element);
    }

}