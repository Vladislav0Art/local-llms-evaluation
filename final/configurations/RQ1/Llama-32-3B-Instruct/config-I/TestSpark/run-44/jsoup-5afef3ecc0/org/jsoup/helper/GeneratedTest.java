package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void build_WithoutQueryOrFragment_ReturnsOriginalUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

    @Test
    public void build_WithQuery_ReturnsNormalizedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query=Hello%2C+World");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(new URL("http://example.com/path?query=Hello%2C%20World"), urlBuilder.build());
    }

    @Test
    public void build_WithQueryAndFragment_ReturnsNormalizedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query=Hello%2C+World#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(new URL("http://example.com/path?query=Hello%2C%20World#fragment"), urlBuilder.build());
    }

    @Test
    public void build_WithoutQueryOrFragment_ReturnsOriginalUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query=Hello%2C+World#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

}