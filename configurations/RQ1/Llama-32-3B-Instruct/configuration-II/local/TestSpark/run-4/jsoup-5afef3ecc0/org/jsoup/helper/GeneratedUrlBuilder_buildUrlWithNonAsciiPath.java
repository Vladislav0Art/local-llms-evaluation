package org.jsoup.helper;

public class GeneratedUrlBuilder_buildUrlWithNonAsciiPath {

    @Test
    public void urlBuilder_buildUrlWithNonAsciiPath() {
        URL u = new URL("http://example.com/äöü/path/to/resource");
        UrlBuilder builder = new UrlBuilder(u);
        assertNotNull(builder.u);
        assertEquals("http://example.com/&#228;&#338;&#252;/path/to/resource", builder.u.toString());
    }

}