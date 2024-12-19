package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyVal_KVWithEmptyKey_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_KVWithEmptyKey_ThrowsUnsupportedEncodingException() {
        Connection.KeyVal kv = new Connection.KeyVal("", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

}