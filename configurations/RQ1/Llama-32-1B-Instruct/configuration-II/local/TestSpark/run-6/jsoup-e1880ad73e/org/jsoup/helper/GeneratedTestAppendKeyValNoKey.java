package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoKey {

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
    public void testAppendKeyValNoKey() {
        String encoded = "value1=value2";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        builder.appendKeyVal(Connection.KeyVal.empty());
        assertEquals("value1=value2", builder.getNormalizedUrl().getQuery());
    }

}