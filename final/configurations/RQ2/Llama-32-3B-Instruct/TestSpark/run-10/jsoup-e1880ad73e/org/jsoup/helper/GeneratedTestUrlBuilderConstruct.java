package org.jsoup.helper;

public class GeneratedTestUrlBuilderConstruct {

    private static final String URL = "http://example.com";

    @Test
    public void testUrlBuilderConstruct() throws MalformedURLException {
        try {
            new org.jsoup.helper.UrlBuilder(connection());
            fail("Expected exception was not thrown");
        } catch (MalformedURLException e) {
            // expected
        }
        try {
            new org.jsoup.helper.UrlBuilder(new URL(URL));
            fail("Expected exception was not thrown");
        } catch (URISyntaxException e) {
            // expected
        }
    }

}