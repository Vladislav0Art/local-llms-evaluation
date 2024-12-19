package org.jsoup.helper;

public class GeneratedTestBuildWithoutQueryAndFragment {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testBuildWithoutQueryAndFragment() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        urlBuilder = u = inputUrl;
        String normUrl = urlBuilder.build();
        assertEquals("https://example.com/path/to/resource", normUrl.toString());
    }

}