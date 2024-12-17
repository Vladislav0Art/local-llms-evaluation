package org.jsoup.helper;

public class GeneratedBuild_ReturnsUrl_WithInputUrl {

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
    public void build_ReturnsUrl_WithInputUrl() throws MalformedURLException {
        when(inputUrl.toString()).thenReturn("http://example.com");
        URL url = getUrlBuilder().build();
        assertEquals("http://example.com", url.toString());
    }

}