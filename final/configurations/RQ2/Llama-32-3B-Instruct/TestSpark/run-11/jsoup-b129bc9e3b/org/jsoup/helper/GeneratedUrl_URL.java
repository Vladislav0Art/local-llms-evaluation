package org.jsoup.helper;

public class GeneratedUrl_URL {

    @Test
    public void url_URL() {
        URL url = new URL("http://example.com");
        assertSame(url, HttpConnection.connect(url));
    }

}