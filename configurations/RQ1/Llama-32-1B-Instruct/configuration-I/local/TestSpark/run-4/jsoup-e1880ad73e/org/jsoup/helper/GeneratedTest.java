package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNormalUrl() {
        final String url = "https://example.com/path?a=1&b=2";
        final URLBuilder builder = new UrlBuilder(new URL(url));
        assert builder.u == new URL("https://example.com/path");
        assert null == builder.q;
        builder.appendKeyVal(new KeyVal("a", "1"));
        builder.appendKeyVal(new KeyVal("b", "2"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1&b%3D2", normalizedUrl);
    }

    @Test
    public void testEncodedPath() {
        final String url = "https://example.com/path?a=1&b=2";
        final URLBuilder builder = new UrlBuilder(new URL(url));
        assert builder.u == new URL("https://example.com/path?%3Aa%3D1&%3Ab%3D2");
        assert null == builder.q;
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?%3Aa%3D1%26%3Ab%3D2", normalizedUrl);
    }

    @Test
    public void testEmptyQuery() {
        final URLBuilder builder = new UrlBuilder(new URL(""));
        assert builder.u == new URL("");
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/", normalizedUrl);
    }

    @Test
    public void testNullQueryOrRef() {
        final URLBuilder builder = new UrlBuilder(null);
        assert builder.q == null;
        try {
            builder.appendKeyVal(new KeyVal());
        } catch (UnsupportedEncodingException e) {
            fail("Expected URISyntaxException");
        }
    }

    @Test
    public void testAppendKeyVal_Simple() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        assert builder.u == new URL("https://example.com/path");
        builder.appendKeyVal(new KeyVal("a", "1"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_SpecialChars() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path?%20a=1"));
        assert builder.u == new URL("https://example.com/path?%20a%3D1");
        builder.appendKeyVal(new KeyVal("b", "2"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?%20a%3D1&b%3D2", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_Space() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path? a=1 & b=2"));
        assert builder.u == new URL("https://example.com/path? a%3D1& b%3D2");
        builder.appendKeyVal(new KeyVal("c", "3"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1&b%3D2& c%3D3", normalizedUrl);
    }

    @Test
    public void testAppendKeyVal_ExistingEscapes() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path? a=1 b=2"));
        assert builder.u == new URL("https://example.com/path? a%3D1&b%3D2");
        builder.appendKeyVal(new KeyVal("c", "3"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1&b%3D2& c%3D3", normalizedUrl);
    }

}