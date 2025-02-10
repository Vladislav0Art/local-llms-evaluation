package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilderAppendMultiKeyValsTest {

    @Test
    public void urlBuilderAppendMultiKeyValsTest() throws UnsupportedEncodingException {
        String expectedUrl = "http://example.com?key1=value1&key2=value2";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> kvMap = new HashMap<>();
        kvMap.put("key1", "value1");
        kvMap.put("key2", "value2");
        for (Connection.KeyVal kv : kvMap.entrySet()) {
            builder.appendKeyVal(kv);
        }
        assertEquals(expectedUrl, builder.build().toString());
    }

}