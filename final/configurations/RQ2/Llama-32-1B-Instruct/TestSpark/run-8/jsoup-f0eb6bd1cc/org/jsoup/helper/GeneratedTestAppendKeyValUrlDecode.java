package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValUrlDecode {

    @Test
    public void testAppendKeyValUrlDecode() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertEquals("https%3A%2F%2Fexample.com%2Fkey=value", result);
    }

}