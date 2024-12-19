package org.jsoup.helper;

public class GeneratedCreateUrlBuilderWithValidUrl {

    private UrlBuilder urlBuilder;

    @Test
    public void createUrlBuilderWithValidUrl() {
        URL url = new URL("http://example.com/path?query=abc#fragment");
        urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder.u);
    }

}