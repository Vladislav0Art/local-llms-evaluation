package org.jsoup.helper;

public class GeneratedUrlBuilder_buildUrlWithQueryAndRef {

    @Test
    public void urlBuilder_buildUrlWithQueryAndRef() {
        URL u = new URL("http://example.com/path/to/resource?query=abc&ref=123456789");
        UrlBuilder builder = new UrlBuilder(u);
        assertNotNull(builder.u);
        assertEquals("http://example.com/path/to/resource%3Fquery=abc%26ref=123456789", builder.u.toString());
    }

}