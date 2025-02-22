package org.jsoup.helper;

public class GeneratedBuild_shouldReturnNormalizedQuery {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void build_shouldReturnNormalizedQuery() throws Exception {
        urlBuilder.q = new StringBuilder("a=b&c=d");

        URL url = urlBuilder.build();

        assertEquals("a=b&c=d", url.getQuery());
    }

}