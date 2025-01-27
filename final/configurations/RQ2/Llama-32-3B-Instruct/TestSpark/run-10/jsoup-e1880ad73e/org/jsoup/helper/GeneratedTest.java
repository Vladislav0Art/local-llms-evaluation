package org.jsoup.helper;

public class GeneratedTest {

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

    @Test
    public void testBuildUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new org.jsoup.helper.UrlBuilder(new URL(URL));
        assertEquals(URL, builder.build().toString());
    }

    @Test
    public void testBuildUrlInvalidUri() throws MalformedURLException, URISyntaxException {
        try {
            new org.jsoup.helper.UrlBuilder(null);
            fail("Expected exception was not thrown");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new org.jsoup.helper.UrlBuilder(new URL(URL));
        String kv = "key=value";
        assertEquals(URL + "?key=value", builder.appendKeyVal(kv).toString());
    }

    private java.net.URL connection() {
        return null;
    }
}

public class UrlBuilder {

    public UrlBuilder(java.net.URL url) throws URISyntaxException {
        // implementation
    }

    public String appendKeyVal(String kv) {
        // implementation
    }

    public java.net.URLConnection getURLConnection() {
        // implementation
    }

    public String build() {
        // implementation
    }

}