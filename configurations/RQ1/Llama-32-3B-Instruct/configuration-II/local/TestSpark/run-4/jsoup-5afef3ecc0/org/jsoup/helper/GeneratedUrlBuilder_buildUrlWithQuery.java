package org.jsoup.helper;

public class GeneratedUrlBuilder_buildUrlWithQuery {

    @Test
    public void urlBuilder_buildUrlWithQuery() {
        URL u = new URL("http://example.com/path/to/resource?query=abc");
        UrlBuilder builder = new UrlBuilder(u);
        assertNotNull(builder.u);
        assertEquals("http://example.com/path/to/resource?query=abc", builder.u.toString());
    }

}