package org.jsoup.helper;

public class GeneratedBuildUrl_withQueryParams {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void buildUrl_withQueryParams() {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("param1", "value1");
        when(urlBuilder.inputUrl()).thenReturn(new URL("http://example.com/path/to/page?param1=value1"));
        URL expectedUrl = new URL("http://example.com/path/to/page?param2=value2");
        when(urlBuilder.build()).thenReturn(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}