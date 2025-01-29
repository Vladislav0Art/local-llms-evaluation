package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_ThrowsExceptionWhenNonExistentKeyAndKeyValue {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_ThrowsExceptionWhenNonExistentKeyAndKeyValue() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}