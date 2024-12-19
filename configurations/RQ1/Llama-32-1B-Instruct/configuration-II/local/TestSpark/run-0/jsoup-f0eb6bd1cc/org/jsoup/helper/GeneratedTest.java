package org.jsoup.helper;

public class GeneratedTest {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testBuildWithNoQuery() {
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build().getProtocol());
        assertEquals(null, urlBuilder.build().getQuery());
        assertEquals(originalInputUrl, urlBuilder.build().getPath());
    }

    @Test
    public void testAppendKeyValWithoutNullQ() {
        urlBuilder = new UrlBuilder(inputUrl);
        String encodedKey = "key";
        String encodedValue = "value";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(encodedKey, encodedValue));
        assertEquals("key=value", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithNullQ() {
        urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(null);
        assertEquals("", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithEmptyKeyVal() {
        urlBuilder = new UrlBuilder(inputUrl);
        String emptyKey = "";
        String emptyValue = "";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(emptyKey, emptyValue));
        assertEquals("", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithEscapedCharacters() {
        urlBuilder = new UrlBuilder(inputUrl);
        String escapedKey = "key with %20";
        String escapedValue = "value with \xFF";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(escapedKey, escapedValue));
        assertEquals("key%20with%20%23", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithNonAsciiCharacters() {
        urlBuilder = new UrlBuilder(inputUrl);
        String nonAsciiKey = "\u0020";
        String nonAsciiValue = "value with \xFF\u2023";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(nonAsciiKey, nonAsciiValue));
        assertEquals("key%20with%23", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithNonAsciiValues() {
        urlBuilder = new UrlBuilder(inputUrl);
        String nonAsciiKey = "\u0020";
        String nonAsciiValue = "value\u2023";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(nonAsciiKey, nonAsciiValue));
        assertEquals("key%20with%23", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithNoEscapedCharacters() {
        urlBuilder = new UrlBuilder(inputUrl);
        String escapedKey = "key";
        String escapedValue = "value";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(escapedKey, escapedValue));
        assertEquals("key=value", urlBuilder.build().getQuery());
    }

    @Test
    public void testAppendKeyValWithNullKey() {
        urlBuilder = new UrlBuilder(inputUrl);
        String nullKey = "";
        try {
            urlBuilder.appendKeyVal(null);
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException");
        }
    }

    @Test
    public void testAppendKeyValWithEmptyKey() {
        urlBuilder = new UrlBuilder(inputUrl);
        String emptyKey = "";
        try {
            urlBuilder.appendKeyVal(emptyKey);
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException");
        }
    }

}