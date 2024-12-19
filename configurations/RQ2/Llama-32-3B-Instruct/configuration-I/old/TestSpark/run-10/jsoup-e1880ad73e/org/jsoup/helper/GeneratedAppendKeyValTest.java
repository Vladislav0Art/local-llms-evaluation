package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValTest {

    @Test
    public void AppendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> keyValues = new HashMap<>();
        keyValues.put("key", "value");
        org.jsoup.helper.Connection.KeyVal kv = org.jsoup.helper.Connection.KeyVal.create(keyValues);
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=value", urlBuilder.build().toString());
    }

}