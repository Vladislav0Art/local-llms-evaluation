package org.jsoup.helper;

public class GeneratedBuildAbsoluteUrl_AbsoluteUrl_test {

    @Test
    public void buildAbsoluteUrl_AbsoluteUrl_test() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        URL url = builder.build();
        assertNotNull(url);
        assertTrue(url.isAbsolute());
        assertEquals("/path/to/resource", url.getPath());
    }

}