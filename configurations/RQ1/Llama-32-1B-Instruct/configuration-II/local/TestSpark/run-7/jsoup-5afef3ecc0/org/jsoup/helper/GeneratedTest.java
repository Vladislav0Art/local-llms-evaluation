package org.jsoup.helper;

public class GeneratedTest {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyVal() {
        String key = "testKey";
        String value = "testValue";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));
        assertEquals("testKey=testValue", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyValNoQuery() {
        String key = "testKey";
        String value = "testValue";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));
        assertEquals("testKey=", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyValNoRef() {
        String key = "testKey";
        String value = "testValue";
        urlBuilder.appendKeyVal(null);
        assertEquals("testKey=testValue", urlBuilder.build().toString());
    }

    @Test
    public void testBuildWithoutQueryAndFragment() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        urlBuilder = u = inputUrl;
        String normUrl = urlBuilder.build();
        assertEquals("https://example.com/path/to/resource", normUrl.toString());
    }

    @Test
    public void testBuildWithQuery() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path/to/resource?query=value");
        urlBuilder = u = inputUrl;
        String normUrl = urlBuilder.build();
        assertEquals("https://example.com/path/to/resource?query=value", normUrl.toString());
    }

    @Test
    public void testBuildWithFragment() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path/to/resource#fragment");
        urlBuilder = u = inputUrl;
        String normUrl = urlBuilder.build();
        assertEquals("https://example.com/path/to/resource#fragment", normUrl.toString());
    }

    @Test
    public void testAppendKeyValWithInvalidKey() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValWithInvalidValue() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("test", "invalid-value"));
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValWithEmptyValue() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("", "test-value"));
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValWithEmptyQuery() {
        URL inputUrl = new URL("https://example.com/path/to/resource?query=");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValWithEmptyFragment() {
        URL inputUrl = new URL("https://example.com/path/to/resource#fragment=");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}