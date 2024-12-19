package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmpty {

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
    public void testAppendKeyValEmpty() {
        UrlBuilder builder = new UrlBuilder(new URL(url));
        String encoded = "";
        builder.appendKeyVal(Connection.KeyVal.of("key1", encoded));
        assertEquals("", builder.getNormalizedUrl().getQuery());
    }

}