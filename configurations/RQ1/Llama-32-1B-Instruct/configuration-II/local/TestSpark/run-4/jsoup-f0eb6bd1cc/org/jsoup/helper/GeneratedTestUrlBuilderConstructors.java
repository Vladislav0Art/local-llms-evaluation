package org.jsoup.helper;

public class GeneratedTestUrlBuilderConstructors {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testUrlBuilderConstructors() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com/path/to/resource"));
        assertEquals(builder.u, null);

        builder.setUrl("https://example2.com/path/to/resource");
        assertEquals(builder.u, new URI("https://example2.com/path/to/resource"));

        builder.setProtocol(null);
        assertEquals(builder.u, null);

        UrlBuilder builder2 = new UrlBuilder(new URI(url));
        builder2.setPort(8080);
        assertEquals(builder2.u, new URI("https://example3.com/path/to/resource?param=value#anchor", 8080));

        builder2.setHost("example4.com");
        assertEquals(builder2.u, new URI(
                "https://example4.com/path/to/resource?param=value#anchor",
                null, null, null,
                null, null, null
        ));

        UrlBuilder builder3 = new UrlBuilder(new URI(url));
        builder3.setQuery(null);
        assertEquals(builder3.u, new URI("https://example5.com/path/to/resource"));

        builder3.setQuery("param=value");
        assertEquals(builder3.u, new URI(
                "https://example6.com/path/to/resource?param=value#anchor",
                null, null, null,
                null, null, null
        ));

        UrlBuilder builder4 = new UrlBuilder(new URI(url));
        builder4.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals(builder4.u, new URL(StringUtil.releaseBuilder(
                new URI(
                        "https://example7.com/path/to/resource?param=value#anchor",
                        null, null, null,
                        null, null, null
                )
        )));
    }

}