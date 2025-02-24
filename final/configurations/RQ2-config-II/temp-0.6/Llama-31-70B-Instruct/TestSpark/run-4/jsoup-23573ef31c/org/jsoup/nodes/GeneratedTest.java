package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void testLocation() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void testHead() {
        Document document = new Document("http://example.com");
        assertNotNull(document.head());
    }

    @Test
    public void testBody() {
        Document document = new Document("http://example.com");
        assertNotNull(document.body());
    }

    @Test
    public void testTitle() {
        Document document = new Document("http://example.com");
        assertEquals("", document.title());
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void testCharset() {
        Document document = new Document("http://example.com");
        assertNotNull(document.charset());
        document.charset(Charset.forName("utf-8"));
        assertEquals(Charset.forName("utf-8"), document.charset());
    }

    @Test
    public void testQuirksMode() {
        Document document = new Document("http://example.com");
        assertEquals(QuirksMode.noQuirks, document.quirksMode());
        document.quirksMode(QuirksMode.quirks);
        assertEquals(QuirksMode.quirks, document.quirksMode());
    }

}