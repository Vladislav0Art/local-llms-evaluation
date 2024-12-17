package org.jsoup.helper;

public class GeneratedTestBuildUrl {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testBuildUrl() {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        assert builder.build().getProtocol().equals("https");
        assert builder.build().getHost().equals("example.com");
    }

}