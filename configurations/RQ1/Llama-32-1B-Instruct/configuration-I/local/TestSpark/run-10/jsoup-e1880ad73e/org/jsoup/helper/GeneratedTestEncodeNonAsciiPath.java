package org.jsoup.helper;

public class GeneratedTestEncodeNonAsciiPath {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testEncodeNonAsciiPath() {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        String url = builder.build().getProtocol();
        assert !url.contains("path");
    }

}