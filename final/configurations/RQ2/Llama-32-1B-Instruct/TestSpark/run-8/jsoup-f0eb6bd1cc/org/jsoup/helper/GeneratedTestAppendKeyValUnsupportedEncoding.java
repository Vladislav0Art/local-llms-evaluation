package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValUnsupportedEncoding {

    @Test
    public void testAppendKeyValUnsupportedEncoding() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        try {
            String result = builder.build().toString();
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}