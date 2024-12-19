package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoFragment {

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
    public void testAppendKeyValNoFragment() {
        String encoded = "key=value";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        builder.appendKeyVal(Connection.KeyVal.of("key", encoded));
        assertEquals(encoded, builder.getNormalizedUrl().getPath());
    }

}