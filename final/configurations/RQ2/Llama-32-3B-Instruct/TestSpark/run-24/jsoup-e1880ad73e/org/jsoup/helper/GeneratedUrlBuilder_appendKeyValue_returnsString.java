package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyValue_returnsString {

    @Test
    public void urlBuilder_appendKeyValue_returnsString() {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        String result = urlBuilder.appendKeyVal(kv).encode();
        assertNotNull(result);
        assertTrue(result.contains("key=value"));
    }

}