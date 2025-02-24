package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private Document document;

    @Test
    public void testLocation() {
        document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void testTitle() {
        document = new Document("http://example.com");
        document.title("Example Title");
        assertEquals("Example Title", document.title());
    }

    @Test
    public void testCharset() {
        document = new Document("http://example.com");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void testQuirksMode() {
        document = new Document("http://example.com");
        document.quirksMode(QuirksMode.noQuirks);
        assertEquals(QuirksMode.noQuirks, document.quirksMode());
    }

    @Test
    public void testConnection() {
        document = new Document("http://example.com");
        Connection connection = Jsoup.connect("http://example.com");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}