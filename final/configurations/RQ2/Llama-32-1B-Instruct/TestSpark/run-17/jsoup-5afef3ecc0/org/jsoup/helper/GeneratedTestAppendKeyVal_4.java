package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_4 {

    private final UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testAppendKeyVal_4() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value).toKeyVal("foo", "bar"));
        // No assertion needed as the method does not modify any external state
    }

}