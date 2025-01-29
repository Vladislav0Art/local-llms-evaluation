package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValMalformedURLException {

    private UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testAppendKeyValMalformedURLException() {
        String[] kv = {"key1=value1", "key2=value2"};
        URL url = new URI("https://www.example.com");
        assertEquals("java.net.MalformedURLException: The URL is malformed.", urlBuilder.appendKeyVal(kv).toString());
    }

}