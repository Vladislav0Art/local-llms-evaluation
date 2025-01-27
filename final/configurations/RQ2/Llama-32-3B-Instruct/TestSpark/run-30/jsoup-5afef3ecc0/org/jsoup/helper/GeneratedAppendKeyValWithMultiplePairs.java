package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValWithMultiplePairs {

    @Test
    public void appendKeyValWithMultiplePairs() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        org.jsoup.util.DataUtil.KeyVal kv1 = new org.jsoup.util.DataUtil.KeyVal("key1", "value1");
        org.jsoup.util.DataUtil.KeyVal kv2 = new org.jsoup.util.DataUtil.KeyVal("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        String result = builder.build().toString();
        assertTrue(result.contains("?key1=value1&key2=value2"));
    }

}