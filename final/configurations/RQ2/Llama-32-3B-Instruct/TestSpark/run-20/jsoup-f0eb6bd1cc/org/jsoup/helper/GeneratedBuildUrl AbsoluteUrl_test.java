package org.jsoup.helper;

public class GeneratedBuildUrl AbsoluteUrl_test {

    @Test
    public void buildUrl

    AbsoluteUrl_test() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        URL url = builder.build();
        assertNotNull(url);
        assertTrue(url.isAbsolute());
        assertEquals("/path/to/resource", url.getPath());
    }

}