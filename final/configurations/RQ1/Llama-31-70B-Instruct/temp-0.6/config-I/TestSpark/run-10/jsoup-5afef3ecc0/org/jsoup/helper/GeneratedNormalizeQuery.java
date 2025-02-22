package org.jsoup.helper;

public class GeneratedNormalizeQuery {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void normalizeQuery() {
        String normalizedQuery = UrlBuilder.normalizeQuery("key=value");
        assertEquals("key=value", normalizedQuery);
    }

}