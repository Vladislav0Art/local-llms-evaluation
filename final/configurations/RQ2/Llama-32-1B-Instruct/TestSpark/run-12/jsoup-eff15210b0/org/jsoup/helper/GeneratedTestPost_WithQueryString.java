package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestPost_WithQueryString {

    private Document doc;

    @Before
    public void setup() throws Exception {
        String url = "https://example.com";
        try (Document document = Jsoup.connect(url).get()) {
            this.doc = document;
        }
    }

    @Test
    public void testPost_WithQueryString() throws Exception {
        String responseText = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello World!";
        assertEquals(responseText, new String(doc.body().text()));
    }

}