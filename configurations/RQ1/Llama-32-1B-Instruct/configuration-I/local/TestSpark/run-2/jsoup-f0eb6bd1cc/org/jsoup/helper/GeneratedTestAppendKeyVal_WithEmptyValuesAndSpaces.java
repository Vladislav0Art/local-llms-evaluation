package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithEmptyValuesAndSpaces {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testAppendKeyVal_WithEmptyValuesAndSpaces() throws UnsupportedEncodingException {
        inputUrl = "https://example.com/path/to/resource";
        URLBuilder.url = "https://example.com/path/to/resource?query=abc";
        String[] values = {"value1", "", "value3"};
        for (String value : values) {
            UrlBuilder.appendKeyVal(new java.net.KeyVal("key", value));
        }
        result = UrlBuilder.build();
        assert result != null;
    }

    private void setup() {
        UrlBuilder.url = "https://example.com/path/to/resource";
    }

}