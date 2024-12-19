package org.jsoup.helper;

public class GeneratedTestAppendKeyValue {

    @Test
    public void testAppendKeyValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(new java.util.HashMap<java.net.KeyedHash, String>() {{
            put("key", "value");
        }});
        assertEquals("https://example.com?key=value", urlBuilder.build().toString());
    }

}