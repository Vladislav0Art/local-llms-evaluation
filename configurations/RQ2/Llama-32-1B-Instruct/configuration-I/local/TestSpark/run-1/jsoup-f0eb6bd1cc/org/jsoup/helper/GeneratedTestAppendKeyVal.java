package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        KeyVal kv1 = new KeyVal("key1", "value1");
        KeyVal kv2 = new KeyVal("key2", "value2");

        URLBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        String expectedOutput = "https://example.com/path?query=value1&key2=value2";
        assertEquals(expectedOutput, urlBuilder.build().toString());
    }

}