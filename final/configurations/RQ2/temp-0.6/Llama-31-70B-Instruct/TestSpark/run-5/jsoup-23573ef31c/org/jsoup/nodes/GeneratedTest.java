package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testLocation() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        String location = document.location();

        assertNotNull(location);
        assertEquals(baseUri, location);
    }

    @Test
    public void testHead() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element head = document.head();

        assertNotNull(head);
    }

    @Test
    public void testBody() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element body = document.body();

        assertNotNull(body);
    }

    @Test
    public void testTitle() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        String title = document.title();

        assertEquals("", title);
    }

}