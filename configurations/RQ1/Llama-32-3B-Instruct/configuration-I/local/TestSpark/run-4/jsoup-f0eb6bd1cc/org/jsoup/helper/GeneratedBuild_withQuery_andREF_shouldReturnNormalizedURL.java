package org.jsoup.helper;

public class GeneratedBuild_withQuery_andREF_shouldReturnNormalizedURL {

    private static final String PROTOCOL = "https://example.com";
    private static final String PATH = "/path/to/resource";
    private static final String QUERY = "key=value&key2=value2";
    private static final String REF = "#anchor";
    private static final String SPACE = " ";
    private static final String NON_ASCII_CHAR = "\u00E0";

    @Test
    public void build_withQuery_andREF_shouldReturnNormalizedURL() {
        UrlBuilder builder = new UrlBuilder(new URL(PROTOCOL + "://example.com" + PATH + "?" + QUERY));
        builder.appendKeyVal(Connection.KeyVal.of("key", REF));
        assert builder.build().getProtocol().equals(PROTOCOL) && builder.build().getPath().equals(PATH);
    }

}