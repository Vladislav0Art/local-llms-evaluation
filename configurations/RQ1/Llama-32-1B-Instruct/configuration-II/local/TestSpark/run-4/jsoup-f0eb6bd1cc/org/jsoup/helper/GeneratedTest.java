package org.jsoup.helper;

public class GeneratedTest {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testBuildUrls() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URI(url));
        URL originalUrl = url;
        URL normalizedUrl = builder.build();
        assertEquals(originalUrl, normalizedUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URI(url));
        StringBuilder sb = new StringBuilder();
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL normalizedUrl = builder.build();
        assertEquals(sb.toString(), normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_InvalidEncoding() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URI(url));
        StringBuilder sb = new StringBuilder();
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL normalizedUrl = builder.build();
        // The UnsupportedEncodingException should not be thrown in this case
    }

    @Test
    public void testDecodePart() throws MalformedURLException, URISyntaxException {
        String encoded = "abc";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("abc", decoded);
    }

    @Test
    public void testEncodePath() throws UnsupportedEncodingException {
        URL originalUrl = new URI(
                "https://example.com/path/to/resource?param=value#anchor",
                null, null, null,
                null, null, null
        );
        String normalizedPath = UrlBuilder.decodePart(originalUrl.getPath());
        assertEquals("path\\to\\resource", normalizedPath);
    }

    @Test
    public void testAppendToAscii() throws UnsupportedEncodingException {
        URL originalUrl = new URI(
                "https://example.com/path/to/resource?param=value#anchor",
                null, null, null,
                null, null, null
        );
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(originalUrl);
        String normalizedUrl = builder.build().toString();
        assertEquals("path\\to\\resource?param=value#anchor", normalizedUrl);
    }

    @Test
    public void testValidate() {
        try {
            Validate.assertFail("Invalid URL");
        } catch (Exception e) {
        }

        UrlBuilder builder = new UrlBuilder(new URI(url));
        String[] expectedErrors = {"Remote end will be able to handle it"};
        for (String error : expectedErrors) {
            assert !e.toString().contains(error);
        }
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