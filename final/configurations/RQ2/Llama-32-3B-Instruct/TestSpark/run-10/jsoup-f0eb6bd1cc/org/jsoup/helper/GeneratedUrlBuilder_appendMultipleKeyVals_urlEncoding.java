package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilder_appendMultipleKeyVals_urlEncoding {

    @Test
    public void UrlBuilder_appendMultipleKeyVals_urlEncoding() throws URISyntaxException, UnsupportedEncodingException {
        Map<String, String> keyVals = new HashMap<>();
        keyVals.put("key1", "value with spaces");
        keyVals.put("key2", "value with spaces");
        Connection.KeyVal[] kvArray = new org.jsoup.internal.StringUtil.KeyVal[keyVals.size()];
        for (Map.Entry<String, String> entry : keyVals.entrySet()) {
            kvArray[i] = new org.jsoup.internal.StringUtil.KeyVal(entry);
        }
        UrlBuilder builder = new UrlBuilder(new URL("https://www.example.com"));
        builder.appendKeyVal(kvArray);
        URI uri = builder.build().toURI();
        assertEquals(uri, new URI("https://www.example.com/key1=value+with+spaces&key2=value+with+spaces"));
    }

}