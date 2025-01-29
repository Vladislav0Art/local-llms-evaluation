package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_2 {

    private final UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testAppendKeyVal_2() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value).toKeyVal());
        // No assertion needed as the method does not modify any external state
    }

}