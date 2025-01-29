package org.jsoup.helper;

public class GeneratedTest {

    private String inputUrl = "https://example.com";

    @Test
    public void testBuild() throws UnsupportedEncodingException {
        URL url = build();
        assertNotNull(url);
    }

    @Test
    public void testAppendKeyVal_SimpleScenario_ExistingKeyValue() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL resultingUrl = urlBuilder.build();
        assertEquals(url, resultingUrl);
    }

    @Test
    public void testAppendKeyVal_SimpleScenario_ExistingKeyValueNotExistent() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL resultingUrl = urlBuilder.build();
        assertNull(resultingUrl);
    }

    @Test
    public void testAppendKeyVal_SimpleScenario_KeyNotExistent() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL resultingUrl = urlBuilder.build();
        assertNull(resultingUrl);
    }

    @Test
    public void testAppendKeyVal_SimpleScenario_NullKey() throws UnsupportedEncodingException {
        KeyVal kv = null;
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyVal_SimpleScenario_EmptyKey() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("", "");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL resultingUrl = urlBuilder.build();
        assertEquals(null, resultingUrl);
    }

    @Test
    public void testAppendKeyVal_WrongTypeScenario() throws UnsupportedEncodingException {
        Object obj = null;
        try {
            urlBuilder.appendKeyVal(obj);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBuild_SingleArgument_ThrowsException() throws UnsupportedEncodingException {
        String singleArgInputUrl = "https://example.com";
        try {
            urlBuilder.build(singleArgInputUrl);
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // Expected
        }
    }

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