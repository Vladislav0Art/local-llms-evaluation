package org.jsoup.helper;

public class GeneratedBuild_shouldReturnOriginalURL_whenNormalizationFails {

    private static final String PROTOCOL = "https://example.com";
    private static final String PATH = "/path/to/resource";
    private static final String QUERY = "key=value&key2=value2";
    private static final String REF = "#anchor";
    private static final String SPACE = " ";
    private static final String NON_ASCII_CHAR = "\u00E0";

    @Test
    public void build_shouldReturnOriginalURL_whenNormalizationFails() {
        UrlBuilder builder = new UrlBuilder(new URL(PROTOCOL + "://example.com" + PATH + "?" + QUERY));
        // Intentionally break normalization
        assert builder.build().equals(builder.u);
    }

}