package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyVal() {
        String key = "testKey";
        String value = "testValue";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));
        assertEquals("testKey=testValue", urlBuilder.build().toString());
    }

}