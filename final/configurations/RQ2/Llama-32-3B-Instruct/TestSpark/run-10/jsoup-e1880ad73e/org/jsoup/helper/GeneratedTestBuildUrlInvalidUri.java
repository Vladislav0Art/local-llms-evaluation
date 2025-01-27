package org.jsoup.helper;

public class GeneratedTestBuildUrlInvalidUri {

    private static final String URL = "http://example.com";

    @Test
    public void testBuildUrlInvalidUri() throws MalformedURLException, URISyntaxException {
        try {
            new org.jsoup.helper.UrlBuilder(null);
            fail("Expected exception was not thrown");
        } catch (URISyntaxException e) {
            // expected
        }
    }

}