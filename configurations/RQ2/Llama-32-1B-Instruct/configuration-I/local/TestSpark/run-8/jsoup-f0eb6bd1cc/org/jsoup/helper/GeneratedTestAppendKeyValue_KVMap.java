package org.jsoup.helper;

public class GeneratedTestAppendKeyValue_KVMap {

    @Test
    public void testAppendKeyValue_KVMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        java.util.Map<java.net.KeyedHash, String> kvMap = new java.util.HashMap<java.net.KeyedHash, String>() {{
            put("key1", "value1");
            put("key2", "value2");
        }};
        urlBuilder.appendKeyVal(kvMap);
        assertEquals("https://example.com?key1=value1&key2=value2", urlBuilder.build().toString());
    }

}