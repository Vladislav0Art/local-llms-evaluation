package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_2 {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testAppendKeyVal_2() throws UnsupportedEncodingException {
        String[] kvPairs = {"key1=value1", "key3=value3"};
        URLBuilder urlBuilder = new UrlBuilder(INPUT_URL);
        urlBuilder.appendKeyVal(new KeyVal(kvPairs));
        URL result = urlBuilder.build();
        assertNotNull(result, "Expected URL to be null");
    }

}