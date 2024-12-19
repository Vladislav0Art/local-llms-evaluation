package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoRef {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValNoRef() {
        String key = "testKey";
        String value = "testValue";
        urlBuilder.appendKeyVal(null);
        assertEquals("testKey=testValue", urlBuilder.build().toString());
    }

}