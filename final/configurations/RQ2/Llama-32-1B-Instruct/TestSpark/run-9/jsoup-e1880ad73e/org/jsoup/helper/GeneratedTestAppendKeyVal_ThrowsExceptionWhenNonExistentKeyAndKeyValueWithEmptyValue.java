package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_ThrowsExceptionWhenNonExistentKeyAndKeyValueWithEmptyValue {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_ThrowsExceptionWhenNonExistentKeyAndKeyValueWithEmptyValue() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "");
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}

class KeyVal {

    private final String key;
    private final Object value;

    public KeyVal(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

}