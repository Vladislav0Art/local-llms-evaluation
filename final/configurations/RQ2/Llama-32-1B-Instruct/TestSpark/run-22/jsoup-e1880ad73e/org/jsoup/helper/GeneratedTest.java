package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilder_noException() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        assertEquals("https://example.com", builder.build());
    }

    @Test
    public void urlBuilder_appendKeyVal_noException() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=value", builder.build());
    }

    @Test
    public void urlBuilder_appendKeyVal_exception() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

    @Test
    public void urlBuilder_urlBuilderNoException() throws MalformedURLException {
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        assertEquals("https://example.com", builder.build());
    }

    @Test
    public void urlBuilder_appendKeyVal_urlBuilderNoException() throws URISyntaxException, UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=value", builder.build());
    }

    @Test
    public void urlBuilder_urlBuilderAppendKeyValNoException() throws MalformedURLException, URISyntaxException {
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        assertEquals("https://example.com?key=value", builder.build());
    }

    @Test
    public void urlBuilder_urlBuilderAppendKeyValException() throws MalformedURLException, URISyntaxException {
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        assertThrows(MalformedURLException.class, () -> builder.appendKeyVal(null));
        assertEquals("", builder.build());

        try {
            builder.appendKeyVal(new Connection.KeyVal());
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
        }
    }

}