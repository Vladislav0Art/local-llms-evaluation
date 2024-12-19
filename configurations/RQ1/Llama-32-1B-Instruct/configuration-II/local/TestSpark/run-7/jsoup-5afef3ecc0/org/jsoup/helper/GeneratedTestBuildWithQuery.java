package org.jsoup.helper;

public class GeneratedTestBuildWithQuery {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testBuildWithQuery() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path/to/resource?query=value");
        urlBuilder = u = inputUrl;
        String normUrl = urlBuilder.build();
        assertEquals("https://example.com/path/to/resource?query=value", normUrl.toString());
    }

}