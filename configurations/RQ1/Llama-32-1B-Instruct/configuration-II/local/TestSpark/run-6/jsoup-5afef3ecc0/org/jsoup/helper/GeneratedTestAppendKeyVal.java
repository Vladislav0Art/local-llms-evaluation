package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private static final String SIMPLE_URL = "https://example.com/path?query=value";

    @Test
    public void testAppendKeyVal() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        builder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
        builder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        String normUrl = builder.build();
        assertEquals("https://example.com/path?key1=value1&key2=value2#foo&bar=baz", normUrl);
    }

}