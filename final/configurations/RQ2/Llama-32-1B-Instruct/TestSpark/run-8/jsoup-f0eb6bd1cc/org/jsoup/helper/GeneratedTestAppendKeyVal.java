package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws IOException {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertNotNull(result);
        assertEquals("https://example.com?key=value", result);
    }

}