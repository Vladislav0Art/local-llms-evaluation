package org.jsoup.helper;

public class GeneratedBuildUrl {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void buildUrl() {
        String expectedUrl = "http://example.com";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}