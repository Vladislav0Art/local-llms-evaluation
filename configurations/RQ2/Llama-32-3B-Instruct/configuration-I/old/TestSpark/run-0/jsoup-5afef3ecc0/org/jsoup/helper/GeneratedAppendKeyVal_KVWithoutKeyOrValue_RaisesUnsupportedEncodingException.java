package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyVal_KVWithoutKeyOrValue_RaisesUnsupportedEncodingException {

    @Test
    public void appendKeyVal_KVWithoutKeyOrValue_RaisesUnsupportedEncodingException() {
        Connection.KeyVal kv = null;
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

}