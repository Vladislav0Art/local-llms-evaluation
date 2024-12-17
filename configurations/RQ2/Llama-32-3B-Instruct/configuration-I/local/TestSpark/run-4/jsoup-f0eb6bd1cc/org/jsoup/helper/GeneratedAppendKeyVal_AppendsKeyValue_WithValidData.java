package org.jsoup.helper;

public class GeneratedAppendKeyVal_AppendsKeyValue_WithValidData {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URL inputUrl;

    public UrlBuilder getUrlBuilder() {
        return new UrlBuilder(inputUrl);
    }

    @org.junit.Before
    public void setup() {
        // No setup is needed, but if you need to initialize mocks or resources,
        // it should be done here.
    }

    @Test
    public void appendKeyVal_AppendsKeyValue_WithValidData() throws UnsupportedEncodingException {
        String encodedValue = Base64.getEncoder().encodeToString(new byte[]{(byte) 0x61, (byte) 0x62});
        Map<String, String> keyVals = new HashMap<>();
        keyVals.put("key", "value");
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn(encodedValue);
        getUrlBuilder().appendKeyVal(keyVals);
        assertEquals("http://example.com?key=value", getUrlBuilder().build().toString());
    }

}