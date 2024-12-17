package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderConstruct() {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        assert builder.u == null;
        assert builder.q == null;
        try {
            new UrlBuilder(url).build();
            fail("Expected a NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testUrlBuilderAppendKeyVal() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert builder.q.toString().equals("key=value");
    }

    @Test
    public void testUrlBuilderAppendKeyValSkipQuery() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert builder.q == null;
    }

    @Test
    public void testUrlBuilderAppendKeyValSkipRef() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert builder.u == null;
    }

    @Test
    public void testUrlBuilderBuild() throws MalformedURLException, URISyntaxException {
        String url = "https://example.com/path/to/resource?query=value#anchor";
        URLBuilder builder = new UrlBuilder(url);
        URL u = builder.build();
        URI uri = new URI(u.getProtocol(), u.getUserInfo(), IDN.toASCII(decodePart(u.getHost())), u.getPort(), null, null, null);
        assert uri.getScheme().equals("https");
        assert uri.getHost().startsWith("example.com");
        assert uri.getPath().equals("/path/to/resource");
    }

    @Test
    public void testUrlBuilderEncodeNonAscii() throws UnsupportedEncodingException {
        String url = "https://example.com/path/étoile";
        URLBuilder builder = new UrlBuilder(url);
        StringBuilder normUrl = StringUtil.borrowBuilder();
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert normUrl.toString().equals("https%3A//example.com/path%20étoile");
    }

}