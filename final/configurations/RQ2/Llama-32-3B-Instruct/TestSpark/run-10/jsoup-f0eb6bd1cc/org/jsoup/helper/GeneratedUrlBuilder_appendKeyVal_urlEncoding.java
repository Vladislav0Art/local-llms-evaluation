package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilder_appendKeyVal_urlEncoding {

    @Test
    public void UrlBuilder_appendKeyVal_urlEncoding() throws URISyntaxException, UnsupportedEncodingException {
        Map<String, String> keyVals = new HashMap<>();
        keyVals.put("key1", "value with spaces");
        Connection.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal(keyVals);
        UrlBuilder builder = new UrlBuilder(new URL("https://www.example.com"));
        builder.appendKeyVal(kv);
        URI uri = builder.build().toURI();
        assertEquals(uri, new URI("https://www.example.com/key1=value+with+spaces"));
    }

}