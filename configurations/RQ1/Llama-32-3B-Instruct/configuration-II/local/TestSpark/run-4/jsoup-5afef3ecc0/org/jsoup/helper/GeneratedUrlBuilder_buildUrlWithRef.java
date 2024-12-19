package org.jsoup.helper;

public class GeneratedUrlBuilder_buildUrlWithRef {

    @Test
    public void urlBuilder_buildUrlWithRef() {
        URL u = new URL("http://example.com/path/to/resource#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertNotNull(builder.u);
        assertEquals("http://example.com/path/to/resource%3Fref=123456789", builder.u.toString());
    }

}