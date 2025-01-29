package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValWithNestedMapReturnsNestedUrl {

    @Test
    public void testAppendKeyValWithNestedMapReturnsNestedUrl() throws UnsupportedEncodingException, IOException {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Map<String, String> map = builder.appendKeyVal("key", "value");
        Map<String, String> nestedMap = builder.appendKeyVal("nested-key", "nested-value");
        assertEquals("https://example.com?key=value&nested-key=nested-value", mapper.toString());
    }

}