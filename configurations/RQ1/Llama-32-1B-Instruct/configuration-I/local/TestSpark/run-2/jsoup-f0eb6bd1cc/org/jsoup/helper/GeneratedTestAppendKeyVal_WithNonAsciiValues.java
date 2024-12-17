package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithNonAsciiValues {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testAppendKeyVal_WithNonAsciiValues() {
        inputUrl = "https://example.com/path/to/resource?query=abc";
        UrlBuilder.url = "https://example.com/path/to/resource";
        String[] values = {"value1", "\uff0b", "value3"};
        for (String value : values) {
            UrlBuilder.appendKeyVal(new java.net.KeyVal("key", value));
        }
        result = UrlBuilder.build();
        assert result != null;
    }

}