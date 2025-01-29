package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValEmptyKeyValue {

    @Test
    public void testAppendKeyValEmptyKeyValue() throws IOException {
        Connection.KeyVal kv = new Connection.KeyVal("");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertEquals("https%3A%2F%2Fexample.com", result);
    }

}