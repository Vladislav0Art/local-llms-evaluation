package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GeneratedAppendKeyValueWithValidKeyValTest {

    @Test
    public void appendKeyValueWithValidKeyValTest() throws UnsupportedEncodingException {
        String urlStr = "https://www.example.com";
        org.jsoup.internal.StringUtil.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(urlStr));
        builder.appendKeyVal(kv);
        assertEquals("https://www.example.com?key=value", builder.build().toString());
    }

}