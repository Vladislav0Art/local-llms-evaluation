package org.jsoup.helper;

public class GeneratedTestBuildWithFragment {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testBuildWithFragment() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path/to/resource#fragment");
        urlBuilder = u = inputUrl;
        String normUrl = urlBuilder.build();
        assertEquals("https://example.com/path/to/resource#fragment", normUrl.toString());
    }

}