package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNullUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assert null == urlBuilder.u;
    }

    @Test
    public void testEmptyPath() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String path = urlBuilder.getPath();
        assertEquals("", path);
    }

    @Test
    public void testNullQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?query=value"));
        assert null == urlBuilder.q;
    }

    @Test
    public void testNullReference() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com#reference"));
        assert null == urlBuilder.q;
    }

    @Test
    public void testAppendKeyVal_PunyCodingHost() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path?query=value&ref=reference"));
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path#reference", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_PunyCodingHost_MalformedQuery() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path?query=value"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path?query=value&ref=reference", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_PunyCodingHost_MalformedReference() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path?query=value"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("ref", "#reference").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path?query=value#reference", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_NoQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://example.com", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_NoReference() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://example.com", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_NoQueryAndReference() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_MalformedReference() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("ref", "reference").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://example.com", normalizedUrl);
    }

}