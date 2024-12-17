package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value#anchor");
        url.appendKeyVal(new KeyVal.Builder().key("param").value("val").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path%3Fquery%2Dev%23anchor";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

    @Test
    public void testAppendKeyValMissingQuery() {
        UrlBuilder url = new UrlBuilder("https://example.com/path");
        url.appendKeyVal(new KeyVal.Builder().key("param").value("val").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

    @Test
    public void testAppendKeyValMissingFragment() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value");
        url.appendKeyVal(new KeyVal.Builder().key("param").value("val").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path%3Bquery%2Dev";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

    @Test
    public void testAppendKeyValMissingAnchor() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value");
        url.appendKeyVal(new KeyVal.Builder().key("anchor").value("anchor").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path?query%2Dev";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

    @Test
    public void testAppendKeyValEscapedQuery() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value#anchor");
        appendToAscii(url, true, "");
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path%3Fquery%2Dev%23anchor";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

    @Test
    public void testAppendKeyValNonAsciiEscaped() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value!anchor");
        appendToAscii(url, false, "");
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path?query%2Fvalue%21anchor";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

    @Test
    public void testAppendKeyValNullRef() {
        UrlBuilder url = new UrlBuilder("https://example.com/path");
        try {
            url.appendKeyVal(null);
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testBuildNoQueryEncoded() {
        URLBuilder url = new UrlBuilder("https://example.com/path");
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}