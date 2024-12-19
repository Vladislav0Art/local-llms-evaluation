package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoRef {

    private static final String SIMPLE_URL = "https://example.com/path?query=value";

    @Test
    public void testAppendKeyValNoRef() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        builder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
        String normUrl = builder.build();
        assertEquals("https://example.com/path?key1=value1", normUrl);
    }

}