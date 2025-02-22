package org.jsoup.helper;

public class GeneratedBuildWithValidUrl {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildWithValidUrl() throws Exception {
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/path/to/page?key=value#anchor", builtUrl.toString());
    }

}