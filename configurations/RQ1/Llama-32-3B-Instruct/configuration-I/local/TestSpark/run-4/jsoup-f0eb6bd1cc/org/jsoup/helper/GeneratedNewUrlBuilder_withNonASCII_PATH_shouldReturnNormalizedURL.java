package org.jsoup.helper;

public class GeneratedNewUrlBuilder_withNonASCII_PATH_shouldReturnNormalizedURL {

    private static final String PROTOCOL = "https://example.com";
    private static final String PATH = "/path/to/resource";
    private static final String QUERY = "key=value&key2=value2";
    private static final String REF = "#anchor";
    private static final String SPACE = " ";
    private static final String NON_ASCII_CHAR = "\u00E0";

    @Test
    public void newUrlBuilder_withNonASCII_PATH_shouldReturnNormalizedURL() {
        UrlBuilder builder = new UrlBuilder(new URL(PROTOCOL + "://example.com" + PATH));
        assert builder.build().getProtocol().equals(PROTOCOL) && builder.build().getPath().equals("path/to/resource");
    }

}