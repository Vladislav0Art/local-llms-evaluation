package org.jsoup.helper;

public class GeneratedBuildCreatesNewUrl {

    @Test
    public void buildCreatesNewUrl() throws MalformedURLException {
        URL originalUrl = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(originalUrl);
        assertEquals(0, originalUrl.getQuery().split("&").length);
    }

}