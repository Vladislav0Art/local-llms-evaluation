package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void constructor_givenNullUrl_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void build_givenValidUrl_returnsNormalizedUrl() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL url = new URL("http://example.com/path?query=abc&def=ghi");
        UrlBuilder builder = new UrlBuilder(url);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/path?q=abc%26def=ghi", normalizedUrl.toString());
    }

    @Test
    public void build_givenInvalidProtocol_throwsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("invalid://example.com/path?query=abc&def=ghi")));
    }

    @Test
    public void appendKeyVal_givenValidKeyAndValue_appendsToQuery() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("?key=value", builder.q.toString());
    }

    @Test
    public void appendKeyVal_givenInvalidEncoding_throwsUnsupportedEncodingException() {
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(new URL("http://example.com/path")).appendKeyVal(new Connection.KeyVal("key", "value")));
    }

    @Test
    public void decodePart_givenValidEncodedString_returnsDecodedString() throws UnsupportedEncodingException {
        String encoded = "%c0%af";
        assertEquals("\u00ae", UrlBuilder.decodePart(encoded));
    }

    @Test
    public void appendToAscii_givenValidString_appendsToStringBuilder() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("hello world", false, sb);
        assertEquals("hello+world", sb.toString());
    }

}