package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilder_appendKeyVal_exception {

    @Test
    public void urlBuilder_appendKeyVal_exception() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

}