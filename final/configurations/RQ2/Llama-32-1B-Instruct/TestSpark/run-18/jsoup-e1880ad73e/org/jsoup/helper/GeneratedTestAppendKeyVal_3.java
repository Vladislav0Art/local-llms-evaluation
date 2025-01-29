package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_3 {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testAppendKeyVal_3() throws UnsupportedEncodingException {
        String[] kvPairs = {"key1=value1", "key2=value2", "key4=value4"};
        URLBuilder urlBuilder = new UrlBuilder(INPUT_URL);
        urlBuilder.appendKeyVal(new KeyVal(kvPairs));
        URL result = urlBuilder.build();
        assertNotNull(result, "Expected URL to be null");
    }

}