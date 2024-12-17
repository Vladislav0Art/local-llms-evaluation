package org.jsoup.helper;

public class GeneratedBuildUrl_noQueryParams {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void buildUrl_noQueryParams() {
        when(urlBuilder.inputUrl()).thenReturn(new URL("http://example.com/path/to/page"));
        URL expectedUrl = new URL("http://example.com/path/to/page");
        when(urlBuilder.build()).thenReturn(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}