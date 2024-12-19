package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyVal_KVWithMultipleValues_AppendsCorrectly {

    @Test
    public void appendKeyVal_KVWithMultipleValues_AppendsCorrectly() {
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("http://example.com?key1=value1", builder.build().toString());
    }

}