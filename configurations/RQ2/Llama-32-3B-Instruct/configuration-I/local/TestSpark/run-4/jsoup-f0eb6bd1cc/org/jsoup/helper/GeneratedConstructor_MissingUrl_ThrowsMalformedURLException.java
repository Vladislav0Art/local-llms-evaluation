package org.jsoup.helper;

public class GeneratedConstructor_MissingUrl_ThrowsMalformedURLException {

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
    public void constructor_MissingUrl_ThrowsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(null));
    }

}