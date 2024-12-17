package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal_WithoutQuery() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithQuery() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithoutFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithoutEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value&charset=utf-8");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithMultipleQueries() {
        URLBuilder builder = new UrlBuilder("https://example.com?query1=value1&query2=value2");
        builder.appendKeyVal(new KeyVal("key1", "value1"));
        builder.appendKeyVal(new KeyVal("key2", "value2"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testAppendKeyVal_WithMultipleQueryValues() {
        URLBuilder builder = new UrlBuilder("https://example.com?query1=value1&query2=value2&query3=value3");
        builder.appendKeyVal(new KeyVal("key1", "value1"));
        builder.appendKeyVal(new KeyVal("key2", "value2"));
        builder.appendKeyVal(new KeyVal("key3", "value3"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

    @Test
    public void testBuildWithoutQuery() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithRef() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithoutEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value&charset=utf-8");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithoutFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testNormalizeQuery() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        builder.appendKeyVal(new KeyVal("key", "value"));
        String normalizedUrl = builder.build();
        assert !normalizedUrl.startsWith("http:");
    }

    @Test
    public void testNormalizeFragment() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        builder.appendKeyVal(new KeyVal("key", "value"));
        String normalizedUrl = builder.build();
        assert !normalizedUrl.startsWith("http:");
    }

    @Test
    public void testNormalizeEncoding() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value&charset=utf-8");
        builder.appendKeyVal(new KeyVal("key", "value"));
        String normalizedUrl = builder.build();
        assert !normalizedUrl.startsWith("http:");
    }

}