package org.jsoup.helper;

public class GeneratedAppendKeyVal_AppendsKeyValue_WithInvalidData {

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
    public void appendKeyVal_AppendsKeyValue_WithInvalidData() {
        assertThrows(UnsupportedEncodingException.class, () -> getUrlBuilder().appendKeyVal(kv));
    }

}