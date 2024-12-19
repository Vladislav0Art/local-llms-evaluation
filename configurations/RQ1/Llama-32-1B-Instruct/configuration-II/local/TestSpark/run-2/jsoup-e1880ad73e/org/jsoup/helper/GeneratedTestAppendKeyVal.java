package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private static final String NORMALIZED_URL = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";

    @Test
    public void testAppendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL(NORMALIZED_URL));
        urlBuilder.appendKeyVal(new KeyVal("key", "value"));
        String expected = "key=value";
        assertEquals(expected, urlBuilder.q.toString());
    }

}