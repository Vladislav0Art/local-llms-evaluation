package org.jsoup.helper;

public class GeneratedBuildNormalizesQueryString {

    @Test
    public void buildNormalizesQueryString() {
        URL inputUrl = new URL("http://example.com/path?query=param+with%20spaces");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assert urlBuilder.u.getQuery().contains("+");
    }

}