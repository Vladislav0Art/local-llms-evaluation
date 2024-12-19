package org.jsoup.helper;

public class GeneratedNewUrlBuilderFromNormalUrlCreatesNewUrl {

    @Test
    public void newUrlBuilderFromNormalUrlCreatesNewUrl() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(new URL("http://example.com/path?a%3D1%26b%3D2%23ref"), urlBuilder.build());
    }

}