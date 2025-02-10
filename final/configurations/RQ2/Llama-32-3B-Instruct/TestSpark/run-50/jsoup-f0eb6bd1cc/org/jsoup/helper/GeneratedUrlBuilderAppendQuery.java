package org.jsoup.helper;

public class GeneratedUrlBuilderAppendQuery {

    @Test
    public void urlBuilderAppendQuery() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(url.toURI());
        assertEquals("http://example.com?query=value", builder.build().toString());
    }

}