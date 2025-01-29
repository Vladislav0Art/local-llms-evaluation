package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValMalformed {

    @Test
    public void testAppendKeyValMalformed() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        try {
            String result = builder.build().toString();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // Expected
        }
    }

}