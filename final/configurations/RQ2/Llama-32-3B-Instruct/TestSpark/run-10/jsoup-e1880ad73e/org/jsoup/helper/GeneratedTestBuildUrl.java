package org.jsoup.helper;

public class GeneratedTestBuildUrl {

    private static final String URL = "http://example.com";

    @Test
    public void testBuildUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new org.jsoup.helper.UrlBuilder(new URL(URL));
        assertEquals(URL, builder.build().toString());
    }

}