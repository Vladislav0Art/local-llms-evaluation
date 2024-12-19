package org.jsoup.helper;

public class GeneratedTest {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        assertEquals("https://example.com/path%2Fto%20test%2Furl", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_Malformed() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair
        assertEquals(null, urlBuilder.build().getQuery());
        assertEquals(urlBuilder.u.toString(), "http://example.com/path/to/test/url");
    }

    @Test
    public void testAppendKeyVal_NullRef() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref
        assertEquals(urlBuilder.u.toString(), "http://example.com/path/to/test/url");
    }

    @Test
    public void testAppendKeyVal_EmptyQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // no key-value pair
        assertEquals(urlBuilder.u.toString(), "http://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendKeyVal_SingleSpace() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal("key", "value")); // single space key-value pair
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value");
    }

    @Test
    public void testAppendKeyVal_Space() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal("key", "value ", 10)); // space as key-value pair value
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value%2010");
    }

    @Test
    public void testAppendKeyVal_NullValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null value as key-value pair
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendRef_Malformed() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendRef_NullRef() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendRef_EmptyRef() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, empty string as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendRef_SingleSpace() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, single space as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value ");
    }

    @Test
    public void testAppendRef_Space() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, space as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value%20");
    }

    @Test
    public void testAppendRef_NullValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, null value as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendRef_EmptyValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, empty string as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

    @Test
    public void testAppendRef_SingleSpace_10() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal("key", "value ", 10)); // single space as key-value pair value, ref
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value%20");
    }

    @Test
    public void testAppendRef_Space_10() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal("key", "value ", 10)); // space as key-value pair value, ref
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value");
    }

    @Test
    public void testAppendRef_NullValue_10() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, null value as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

}