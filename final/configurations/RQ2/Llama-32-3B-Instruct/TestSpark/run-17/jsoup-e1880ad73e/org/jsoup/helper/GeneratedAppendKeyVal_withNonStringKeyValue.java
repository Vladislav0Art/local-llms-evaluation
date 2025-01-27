package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_withNonStringKeyValue {

    @Test
    public void appendKeyVal_withNonStringKeyValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal(1, "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com", urlBuilder.build().toString());
    }

}