package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyVal_KVWithNonEmptyKeyAndValue_AppendsCorrectly {

    @Test
    public void appendKeyVal_KVWithNonEmptyKeyAndValue_AppendsCorrectly() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("http://example.com?key=value", builder.build().toString());
    }

}