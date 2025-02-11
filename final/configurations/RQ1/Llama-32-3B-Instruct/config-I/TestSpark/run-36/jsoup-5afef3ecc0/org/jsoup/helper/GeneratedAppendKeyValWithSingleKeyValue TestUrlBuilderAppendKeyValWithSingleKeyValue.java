package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedAppendKeyValWithSingleKeyValue TestUrlBuilderAppendKeyValWithSingleKeyValue {

    @Test
    public void appendKeyValWithSingleKeyValue

    TestUrlBuilderAppendKeyValWithSingleKeyValue() throws UnsupportedEncodingException {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://a%20b.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(2, urlBuilder.q.toString().length());
    }

}