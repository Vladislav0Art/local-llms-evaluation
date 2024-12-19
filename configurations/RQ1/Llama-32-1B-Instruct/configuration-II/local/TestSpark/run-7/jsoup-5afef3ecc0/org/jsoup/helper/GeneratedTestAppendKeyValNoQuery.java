package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoQuery {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValNoQuery() {
        String key = "testKey";
        String value = "testValue";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));
        assertEquals("testKey=", urlBuilder.build().toString());
    }

}