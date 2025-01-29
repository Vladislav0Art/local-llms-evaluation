package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_1 {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testAppendKeyVal_1() {
        String[] kvPairs = {"key1=value1", "key2=value2"};
        URLBuilder urlBuilder = new UrlBuilder(INPUT_URL);
        urlBuilder.appendKeyVal(new KeyVal(kvPairs));
        URL result = urlBuilder.build();
        assertNotNull(result, "Expected URL to be null");
    }

}