package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilder_appendMultipleKeyVals {

    @Test
    public void UrlBuilder_appendMultipleKeyVals() throws URISyntaxException, UnsupportedEncodingException {
        Map<String, String> keyVals = new HashMap<>();
        keyVals.put("key1", "value1");
        keyVals.put("key2", "value2");
        Connection.KeyVal[] kvArray = new org.jsoup.internal.StringUtil.KeyVal[keyVals.size()];
        for (Map.Entry<String, String> entry : keyVals.entrySet()) {
            kvArray[i] = new org.jsoup.internal.StringUtil.KeyVal(entry);
        }
        UrlBuilder builder = new UrlBuilder(new URL("https://www.example.com"));
        builder.appendKeyVal(kvArray);
        URI uri = builder.build().toURI();
        assertEquals(uri, new URI("https://www.example.com/key1=value1&key2=value2"));
    }

}