package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("&key1=value1&key2=value2", builder.build().getQuery());
    }

    @Test
    public void testAppendKeyValNullReference() {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2");
        builder.appendKeyVal(null);
        assert assertEquals("&a=1&b=2", builder.build().getQuery());
    }

    @Test
    public void testAppendKeyValNoRef() {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2#anchor");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("&a=1&b=2#anchor", builder.build().getFragment());
    }

    @Test
    public void testAppendKeyValNoQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path?query=a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

    @Test
    public void testAppendKeyValNoReferenceOrQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path#anchor");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

    @Test
    public void testAppendKeyValEmptyReferenceOrQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path?query=");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

    @Test
    public void testAppendKeyValEmptyReferenceOrQueryNoRefOrQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path#anchor?query=");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

    @Test
    public void testAppendKeyValNullUri() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder(null);
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("", builder.build().getQuery());
    }

    @Test
    public void testAppendKeyValEmptyUri() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("", builder.build().getQuery());
    }

    @Test
    public void testAppendKeyValEmptyPath() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("https://example.com/path");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("", builder.build().getPath());
    }

    @Test
    public void testAppendKeyValEmptyFragment() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("https://example.com/path?query=a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

    @Test
    public void testAppendKeyValNullStringBuilder() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            assert ThrowsNullPointerException.class.isAssignableFrom(builder.appendKeyVal(kv).getClass());
        }
    }

}