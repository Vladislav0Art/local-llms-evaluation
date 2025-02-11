package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedAppendKeyValWithMultipleKeyValue TestUrlBuilderAppendKeyValWithMultipleKeyValue {

    @Test
    public void appendKeyValWithMultipleKeyValue

    TestUrlBuilderAppendKeyValWithMultipleKeyValue() throws UnsupportedEncodingException {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key1", "value1");
        kv.put("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://a%20b.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(9, urlBuilder.q.toString().length());
    }

}