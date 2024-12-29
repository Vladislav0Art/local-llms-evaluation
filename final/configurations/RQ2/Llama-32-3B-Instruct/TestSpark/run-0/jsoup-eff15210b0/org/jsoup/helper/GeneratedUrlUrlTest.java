package org.jsoup.helper;

public class GeneratedUrlUrlTest {

    @Test
    public void urlUrlTest() {
        URL url = new URL("https://example.com");
        assertSame(url, HttpConnection.url(url));
    }

}