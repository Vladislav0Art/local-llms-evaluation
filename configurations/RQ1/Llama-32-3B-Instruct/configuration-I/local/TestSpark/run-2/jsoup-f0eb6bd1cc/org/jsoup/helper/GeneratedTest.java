package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildUrlWithoutQueryAndFragment() throws Exception {
        String expectedUrl = "https://example.com/path";
        UrlBuilder builder = new UrlBuilder(new URL(expectedUrl));
        assertEquals(expectedUrl, builder.u.toString());
    }

    @Test
    public void buildUrlWithQuery() throws Exception {
        String expectedUrl = "https://example.com/path?a=1&b=2";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value#fragment"));
        assertEquals(expectedUrl, builder.u.toString());
    }

    @Test
    public void buildUrlWithFragment() throws Exception {
        String expectedUrl = "https://example.com/path?a=1&b=2#fragment";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value"));
        assertEquals(expectedUrl, builder.u.toString());
    }

    @Test
    public void buildUrlWithInvalidProtocol() throws Exception {
        String expectedError = "Invalid protocol: https";
        try {
            UrlBuilder builder = new UrlBuilder(new URL("invalid.protocol://example.com/path"));
            fail(expectedError);
        } catch (MalformedURLException e) {
            assertEquals(expectedError, e.getMessage());
        }
    }

    @Test
    public void buildUrlWithFragment() throws Exception {
        String expectedUrl = "https://example.com/path?a=1&b=2#fragment";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value#other"));
        assertEquals(expectedUrl, builder.u.toString());
    }

}