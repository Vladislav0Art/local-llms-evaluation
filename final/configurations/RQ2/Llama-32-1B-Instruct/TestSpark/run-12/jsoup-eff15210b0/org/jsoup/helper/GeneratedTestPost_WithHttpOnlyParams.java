package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPost_WithHttpOnlyParams {

    private Document doc;

    @Before
    public void setup() {
        String url = "https://example.com";
        try {
            doc = Jsoup.connect(url).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testPost_WithHttpOnlyParams() throws Exception {
        String responseText = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello World!";
        Document requestDoc = Jsoup.connect(new URL("https://example.com?param1=value1&param2=value2;httponly").get());
        assertEquals("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello World!", requestDoc.html());
    }

}