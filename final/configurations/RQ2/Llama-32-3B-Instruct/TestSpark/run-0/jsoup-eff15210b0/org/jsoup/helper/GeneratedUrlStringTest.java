package org.jsoup.helper;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() throws MalformedURLException {
        assertSame(HttpConnection.url("https://example.com"), HttpConnection.connect("https://example.com"));
        assertEquals(null, HttpConnection.url(null));
    }

}