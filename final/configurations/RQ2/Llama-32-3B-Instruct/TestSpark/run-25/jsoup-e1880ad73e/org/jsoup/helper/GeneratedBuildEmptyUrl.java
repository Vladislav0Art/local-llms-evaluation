package org.jsoup.helper;

public class GeneratedBuildEmptyUrl {

    private UrlBuilder urlBuilder;

    @Test
    public void buildEmptyUrl() throws URISyntaxException, MalformedURLException {
        URL emptyUrl = new URL("/");
        assertNotSame(emptyUrl, urlBuilder.build());
    }

}