package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void test_build_url_without_key() {
        String inputUrl = "https://example.com";
        URL expected = new URL("https://example.com");
        URL actual = new UrlBuilder(inputUrl).build();
        assertEquals(expected, actual);
    }

    @Test
    public void test_appendKeyVal_no_exception_thrown() {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new KeyVal(key, value));
        assertEquals("name", URLDecoder.decode(builder.inputUrl()));
    }

    @Test
    public void test_appendKeyVal_with_key_and_value() {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = new KeyVal(key, value);
        assertNotEquals("", builder.appendKeyVal(kv));
    }

    @Test
    public void test_appendKeyVal_with_exception() {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertThrows(MalformedURLException.class, () -> builder.appendKeyVal(new KeyVal(key, value)));
    }

    @Test
    public void test_build_url_with_key_val() throws UnsupportedEncodingException {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = new KeyVal(key, value);
        URL actual = builder.build();
        assertEquals("https://example.com", URLDecoder.decode(actual));
    }

    @Test
    public void test_build_url_without_exception_thrown() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com";
        URL expected = new URL("https://example.com");
        URL actual = new UrlBuilder(inputUrl).build();
        assertEquals(expected, actual);
    }

}