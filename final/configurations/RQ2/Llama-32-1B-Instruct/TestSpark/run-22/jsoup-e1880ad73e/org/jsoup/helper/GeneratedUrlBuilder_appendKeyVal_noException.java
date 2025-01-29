package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilder_appendKeyVal_noException {

    @Test
    public void urlBuilder_appendKeyVal_noException() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=value", builder.build());
    }

}