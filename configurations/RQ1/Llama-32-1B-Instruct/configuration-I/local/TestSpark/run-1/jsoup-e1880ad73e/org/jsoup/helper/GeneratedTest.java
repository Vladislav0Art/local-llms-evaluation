package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlBuilderConstruct() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource?key=value&foo=bar");
        assert urlBuilder.u != null;
        assert !urlBuilder.q == null || !urlBuilder.u.getQuery().isEmpty();
    }

    @Test
    public void testUrlBuilderAppendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource?key=value&foo=bar");
        urlBuilder.appendKeyVal(new UrlKeyVal("key", "value"));
        assert urlBuilder.u.getQuery().contains("key=value");
    }

    @Test
    public void testUrlBuilderAppendKeyValWithRef() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource#ref");
        urlBuilder.appendKeyVal(new UrlKeyVal("key", "value"));
        assert !urlBuilder.u.getRef().equals(null);
        assert urlBuilder.u.getRef().contains("#ref");
    }

    @Test
    public void testUrlBuilderDecodePart() {
        String encoded = "example.com/path/to/resource?key=value&foo=bar";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(encoded));
        assert urlBuilder.decodePart(encoded).equals("example.com/path/to/resource");
    }

    @Test
    public void testUrlBuilderEncodeEscapes() throws UnsupportedEncodingException {
        String encoded = "example.com/path/to/resource?key=value&foo=bar";
        URL decodedURL = new URL(encoded);
        assertEquals("https://example.com/path/to/resource", decodedURL.toString());
    }

    @Test
    public void testUrlBuilderEncodeNonAsciiPathComponents() {
        String encoded = "example.com/path/to/resource?key=value&foo=bar";
        URL decodedURL = new URL(encoded);
        assertEquals("https://example.com/path%2Fto/resource?key=value&foo=bar", decodedURL.toString());
    }

    @Test
    public void testUrlBuilderAppendToAscii() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        StringBuilder sb = urlBuilder.toBuilder().appendToAscii(StringUtil.borrowBuilder(), true);
        assert !sb.isEmpty();
    }

}