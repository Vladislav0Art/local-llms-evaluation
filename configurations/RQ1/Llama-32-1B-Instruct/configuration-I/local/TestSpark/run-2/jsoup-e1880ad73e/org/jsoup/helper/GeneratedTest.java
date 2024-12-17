package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?key=value&more=here");
        String[] expected = {"key", "value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

    @Test
    public void testAppendKeyValWithNullValue() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?key=value");
        String[] expected = {"key", "value"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

    @Test
    public void testAppendKeyValWithNullValueAndFragment() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path#fragment?key=value");
        String[] expected = {"key", "value"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getFragment());
        }
    }

    @Test
    public void testAppendKeyValWithNullValueAndQuery() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value#fragment");
        String[] expected = {"key=value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

    @Test
    public void testAppendKeyValWithEncodedQuery() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value");
        String[] expected = {"key=value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

    @Test
    public void testAppendKeyValWithEncodedFragment() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path#fragment");
        String[] expected = {"key=value", null};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getFragment());
        }
    }

    @Test
    public void testAppendKeyValWithEncodedQueryAndFragment() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value#fragment");
        String[] expected = {"key=value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

    @Test
    public void testBuildWithoutQuery() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path");
        URL expected = new URL("http://example.com/path#fragment");
        assertEquals(expected, urlBuilder.build());
    }

    @Test
    public void testBuildWithoutFragment() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value");
        String[] expected = {"http://example.com/path", null};
        for (String key : expected) {
            assertEquals(key, urlBuilder.build().getQuery());
        }
    }

    @Test
    public void testBuildWithoutRef() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value");
        String[] expected = {"http://example.com/path", null};
        for (String key : expected) {
            assertEquals(key, urlBuilder.build().getQuery());
        }
    }

    @Test
    public void testBuildWithoutHost() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder(null);
        URL expected = new URL("http://example.com/path");
        assertEquals(expected, urlBuilder.build().toString());
    }

}