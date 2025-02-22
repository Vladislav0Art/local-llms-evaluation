package org.jsoup.helper;

public class GeneratedBuildWithInvalidUrl {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildWithInvalidUrl() throws Exception {
        URL inputUrl = new URL("http://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertNotEquals("https://www.example.com/path/to/page?key=value#anchor", builtUrl.toString());
    }

}