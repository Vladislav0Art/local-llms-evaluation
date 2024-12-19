package org.jsoup.helper;

public class GeneratedUrlBuilder_buildUrlWithProtocolAndPort {

    @Test
    public void urlBuilder_buildUrlWithProtocolAndPort() {
        URL u = new URL("http://example.com:8080/path/to/resource");
        UrlBuilder builder = new UrlBuilder(u);
        assertNotNull(builder.u);
        assertEquals("http://example.com%3A8080/path/to/resource", builder.u.toString());
    }

}