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
public class GeneratedAppendKeyValMultipleTimesUrlBuilder {

    @Test
    public void appendKeyValMultipleTimesUrlBuilder() throws UnsupportedEncodingException, URISyntaxException {
        String key1 = "key1";
        String val1 = "value1";
        String key2 = "key2";
        String val2 = "value2";
        Connection.KeyVal kv1 = new KeyVal(key1, val1);
        Connection.KeyVal kv2 = new KeyVal(key2, val2);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        builder.appendKeyVal(kv1); // append again to test overwrite
        assertEquals(new URL("http://example.com?key1=value1&key2=value2"), builder.build());
    }

}