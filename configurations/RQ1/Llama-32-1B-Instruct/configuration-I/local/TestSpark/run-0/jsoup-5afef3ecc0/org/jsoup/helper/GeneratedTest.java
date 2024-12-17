package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Test
    public void testNormalizingProtocol() {
        String protocol = "http://example.com";
        URL url = new URL(protocol);
        assertEquals("http:", url.getScheme());
    }

    @Test
    public void testEncodingHostNonAsciiPathComponents() throws MalformedURLException, URISyntaxException {
        String host = "HÃtÃ;
        String path = "/path";
        URI uri = new URI(host, null, IDN.toASCII(decodePart(host)), 8080, decodePart(path));
        assertEquals("http://HÃtÃ/path", uri.toASCIIString());
    }

    @Test
    public void testNormalizationQueryEmpty() {
        URL url = new URL("https://example.com/path?a=b#c=d");
        assertEquals("https://example.com/path?b=c&d#", url.getScheme() + "://" + url.getHost() + "?b=c&d#");
    }

    @Test
    public void testNormalizationQueryNonAscii() throws UnsupportedEncodingException {
        String query = "a=1&b=2";
        URL url = new URL("https://example.com/path", query);
        assertEquals("https://example.com/path?b%3D2&a=1&%26", url.getScheme() + "://" + url.getHost() + "?" + query);
    }

    @Test
    public void testNormalizationRefNonAscii() throws UnsupportedEncodingException {
        String ref = "reference";
        URL url = new URL("https://example.com/path", ref, null, 8080);
        assertEquals("https://reference%3B20", url.getScheme() + "://" + url.getHost());
    }

    @Test
    public void testAppendKeyValSuccess() throws UnsupportedEncodingException {
        String[] kv = {("key", "value"),("another_key", "another_value")};
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?key=value&another_key=another_value", url.getScheme() + "://" + url.getHost());
    }

    @Test
    public void testAppendKeyValFail() {
        String[] kv = {("key", null),("another_key", "value")};
        urlBuilder.appendKeyVal(kv);
        // assert that exception is thrown or handled in some way
        assert false;
    }

}