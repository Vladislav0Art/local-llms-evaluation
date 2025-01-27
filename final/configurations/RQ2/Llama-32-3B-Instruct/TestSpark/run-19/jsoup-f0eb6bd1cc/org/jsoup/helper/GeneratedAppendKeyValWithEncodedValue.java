package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithEncodedValue {

    @Test
    public void appendKeyValWithEncodedValue() throws UnsupportedEncodingException, URISyntaxException {
        String encodedValue = URLEncoder.encode("key", DataUtil.UTF_8);
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", encodedValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

}