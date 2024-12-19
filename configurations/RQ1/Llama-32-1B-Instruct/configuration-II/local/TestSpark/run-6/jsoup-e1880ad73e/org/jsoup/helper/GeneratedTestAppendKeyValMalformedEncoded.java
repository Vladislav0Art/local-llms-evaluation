package org.jsoup.helper;

public class GeneratedTestAppendKeyValMalformedEncoded {

    private final String url;

    @Before
    public void setup() {
        url = "https://example.com/path?a=1&b=2#anchor";
    }

    public UrlBuilderTest(String url) {
        this.url = url;
    }

    public String getNormalizedUrl() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        return new UrlBuilder(url).build().toString();
    }

    @Test
    public void testAppendKeyValMalformedEncoded() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        String malformedEncoded = "key=1&value2";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        builder.appendKeyVal(Connection.KeyVal.of("key", malformedEncoded));
        assertEquals("", builder.getNormalizedUrl().getQuery());
    }

}