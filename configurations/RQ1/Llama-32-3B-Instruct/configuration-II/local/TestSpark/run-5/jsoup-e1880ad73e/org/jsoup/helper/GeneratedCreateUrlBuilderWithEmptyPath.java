package org.jsoup.helper;

public class GeneratedCreateUrlBuilderWithEmptyPath {

    private UrlBuilder urlBuilder;

    @Test
    public void createUrlBuilderWithEmptyPath() {
        URL url = new URL("http://example.com/?query=abc#fragment");
        urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder.u);
    }

}