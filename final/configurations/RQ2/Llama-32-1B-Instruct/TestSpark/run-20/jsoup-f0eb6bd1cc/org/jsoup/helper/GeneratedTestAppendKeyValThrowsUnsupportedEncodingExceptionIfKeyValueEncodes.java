package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValThrowsUnsupportedEncodingExceptionIfKeyValueEncodes {

    @Test
    public void testAppendKeyValThrowsUnsupportedEncodingExceptionIfKeyValueEncodes() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        try {
            builder.appendKeyVal("key", "value");
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}