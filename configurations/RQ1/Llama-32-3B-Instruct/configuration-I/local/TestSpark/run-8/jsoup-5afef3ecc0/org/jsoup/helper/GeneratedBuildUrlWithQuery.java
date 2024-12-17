package org.jsoup.helper;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://test.com?query=param");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

}