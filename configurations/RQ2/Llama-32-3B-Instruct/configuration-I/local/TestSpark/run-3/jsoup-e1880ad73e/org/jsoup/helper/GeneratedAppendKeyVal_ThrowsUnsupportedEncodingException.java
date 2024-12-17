package org.jsoup.helper;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class GeneratedAppendKeyVal_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_ThrowsUnsupportedEncodingException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        java.lang.RuntimeException expectedException = new java.lang.RuntimeException("Unsupported encoding");
        org.junit.Assert.fail(expectedException.getMessage());
    }

}