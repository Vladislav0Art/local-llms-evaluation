package org.jsoup.helper;

public class GeneratedTestAppendKeyValue_ThrowsUnsupportedEncodingException {

    @Test
    public void testAppendKeyValue_ThrowsUnsupportedEncodingException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        String exception = null;
        try {
            urlBuilder.appendKeyVal(new java.util.HashMap<java.net.KeyedHash, String>() {{
                put("key", "value");
            }});
            throw new UnsupportedEncodingException(exception);
        } catch (UnsupportedEncodingException e) {
            assertEquals("UnsupportedEncodingException: ", e.getMessage());
        }
    }

}