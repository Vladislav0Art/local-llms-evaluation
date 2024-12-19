package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyValWithNullKeyThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyValWithNullKeyThrowsUnsupportedEncodingException() {
        String value = "value";
        try {
            new UrlBuilder(null).appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null));
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}