package org.jsoup.helper;

public class GeneratedBuildUrlWithQuery {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void buildUrlWithQuery() {
        Map<String, String> query = new HashMap<>();
        query.put("key1", "value1");
        query.put("key2", "value2");
        when(urlBuilder.inputUrl()).thenReturn(query);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}