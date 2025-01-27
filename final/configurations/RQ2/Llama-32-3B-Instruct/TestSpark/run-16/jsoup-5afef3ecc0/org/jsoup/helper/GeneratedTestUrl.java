package org.jsoup.helper;

public class GeneratedTestUrl {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testUrl() throws URISyntaxException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        URL url = builder.build();
        assertEquals(BASE_URL, url.toString());
        assertNull(url.getFragment());
    }

}