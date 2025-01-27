package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyValue_throwsUnsupportedEncodingException {

    @Test
    public void urlBuilder_appendKeyValue_throwsUnsupportedEncodingException() {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv).encode());
    }

}