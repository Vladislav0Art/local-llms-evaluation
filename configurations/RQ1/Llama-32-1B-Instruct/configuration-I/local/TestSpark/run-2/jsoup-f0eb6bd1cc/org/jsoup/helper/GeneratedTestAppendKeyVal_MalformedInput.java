package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedInput {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testAppendKeyVal_MalformedInput() throws UnsupportedEncodingException {
        inputUrl = "https://example.com/path/to/resource?query=abc";
        URLBuilder.url = "https://example.com/path/to/resource";
        String[] values = {"value1", "", "value3"};
        for (String value : values) {
            UrlBuilder.appendKeyVal(new java.net.KeyVal("key", value));
        }
        try {
            UrlBuilder.build();
            assert false;
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}