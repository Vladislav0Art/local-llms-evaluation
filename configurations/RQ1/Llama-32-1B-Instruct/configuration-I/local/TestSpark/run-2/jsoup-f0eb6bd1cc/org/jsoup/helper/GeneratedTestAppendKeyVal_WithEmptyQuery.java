package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithEmptyQuery {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testAppendKeyVal_WithEmptyQuery() {
        inputUrl = "https://example.com/path/to/resource?query=abc";
        UrlBuilder.url = "https://example.com/path/to/resource";
        UrlBuilder.appendKeyVal(new java.net.KeyVal("key", "value"));
        result = UrlBuilder.build();
        assert result != null;
    }

}