package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

import org.jsoup.Connection.KeyVal;

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValUrlBuilder {

    @Test
    public void appendKeyValUrlBuilder() throws UnsupportedEncodingException, URISyntaxException {
        String key = "key";
        String val = "value";
        Connection.KeyVal kv = new KeyVal(key, val);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(new URL("http://example.com?key=value"), builder.build());
    }

}