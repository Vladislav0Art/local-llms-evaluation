package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;

public class GeneratedTestResponse_WithoutQueryParams {

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
    public void testResponse_WithoutQueryParams() throws Exception {
        String responseText = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello World!";
        assertEquals("Hello World!", new BufferedReader(new InputStreamReader(connection.response().get())) !!.
        readLine());
    }

}