package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_ThrowsExceptionWhenNonExistentKey {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_ThrowsExceptionWhenNonExistentKey() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("non-existent-key", "value");
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}