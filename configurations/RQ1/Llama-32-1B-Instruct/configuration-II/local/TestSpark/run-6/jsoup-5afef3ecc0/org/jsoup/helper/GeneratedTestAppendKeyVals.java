package org.jsoup.helper;

public class GeneratedTestAppendKeyVals {

    private static final String SIMPLE_URL = "https://example.com/path?query=value";

    @Test
    public void testAppendKeyVals() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        String q = Connection.KeyVal.of("key1", "value1").key().toString();
        builder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        builder.appendKeyVal(q);
        String normUrl = builder.build();
        assertEquals("https://example.com/path?key1=value1&key2=value2#foo&bar=baz?query=value", normUrl);
    }

}