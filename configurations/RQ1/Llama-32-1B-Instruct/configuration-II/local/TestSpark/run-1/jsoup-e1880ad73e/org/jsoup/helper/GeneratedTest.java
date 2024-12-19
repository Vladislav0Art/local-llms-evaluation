package org.jsoup.helper;

public class GeneratedTest {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testAppendKeyVal_WithoutQuery() {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"));
        assertEquals(inputUrl, builder.build().toASCIIString());
    }

    @Test
    public void testAppendKeyVal_withQuery() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "?key=value";
        assertEquals(expected, builder.build().toASCIIString());
    }

    @Test
    public void testAppendKeyVal_withFragment() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "#fragment";
        assertEquals(expected, builder.build().toASCIIString());
    }

    @Test
    public void testAppendKeyVal_withRef() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), false);
        String expected = inputUrl + "?ref=abc";
        assertEquals(expected, builder.build().toASCIIString());
    }

    @Test
    public void testAppendKeyVal_withNonAscii() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "?key=abc&ref=abc";
        assertEquals(expected, builder.build().toASCIIString());
    }

    @Test
    public void testBuild_WithQueryAndFragment() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "?query=abc&ref=abc#fragment";
        assertEquals(expected, builder.build().toASCIIString());
    }

    @Test
    public void testBuild_WithoutQuery() {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(null, true);
        String expected = inputUrl;
        assertEquals(expected, builder.build().toASCIIString());
    }

}