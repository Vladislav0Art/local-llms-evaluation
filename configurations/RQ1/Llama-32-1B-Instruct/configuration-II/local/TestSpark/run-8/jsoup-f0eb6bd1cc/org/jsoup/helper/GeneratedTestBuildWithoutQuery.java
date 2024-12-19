package org.jsoup.helper;

public class GeneratedTestBuildWithoutQuery {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithoutQuery() throws UnsupportedEncodingException {
        URLBuilderUrlBuilder urlBuilderUrlBuilder = new UrlBuilderUrlBuilder(null);
        String normUrl = urlBuilderUrlBuilder.build().toString();
        assertEquals(new URI("https://example.com/path", null, null, 0L, null, null), normUrl.toURI());
    }

}