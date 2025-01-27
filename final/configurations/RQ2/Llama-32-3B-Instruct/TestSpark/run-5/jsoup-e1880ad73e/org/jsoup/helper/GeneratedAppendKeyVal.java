package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal(key, value);
        builder.appendKeyVal(kv);
        assertTrue(StringUtil.contains(builder.build().toString(), String.format("%s=%s", key, value)));
    }

}