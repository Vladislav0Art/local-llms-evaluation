package org.jsoup.helper;

public class GeneratedBuildUrlWithBasicAuth {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void buildUrlWithBasicAuth() {
        String credentials = "username:password";
        when(urlBuilder.inputUrl()).thenReturn(credentials);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}