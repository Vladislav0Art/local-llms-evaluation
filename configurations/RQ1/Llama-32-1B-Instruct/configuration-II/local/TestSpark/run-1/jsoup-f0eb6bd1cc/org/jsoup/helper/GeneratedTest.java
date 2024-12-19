package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#query"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%23query%26key%26value", builder.build().toString());
    }

    @Test
    public void testAppendKeyValNoQuery() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%26key%26value", builder.build().toString());
    }

    @Test
    public void testAppendKeyValNoQueryAndRef() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#ref"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%23ref%26key%26value", builder.build().toString());
    }

    @Test
    public void testAppendKeyValNoRef() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%26key%26value", builder.build().toString());
    }

    @Test
    public void testAppendKeyValInvalidEncoding() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#query"));
        try {
            builder.appendKeyVal(KeyVal.of("key", "value"), new UnsupportedEncodingException());
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyValInvalidValue() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#query"));
        try {
            builder.appendKeyVal(KeyVal.of("key", "value"), KeyVal.of("key", null));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendUrlWithoutQuery() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path"));
        assertEquals("https%3A%2F%2Fexample%2Comath", builder.build().toString());
    }

    @Test
    public void testAppendUrlWithRef() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#ref"));
        assertEquals("https%3A%2F%2Fexample%2Comath%23ref", builder.build().toString());
    }

}