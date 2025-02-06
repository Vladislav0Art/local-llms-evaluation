package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTitleElementCreationTest {

    @Test
    public void titleElementCreationTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("title");
        assertNotNull(element);
    }

}