package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithNullValue {

    @Test
    public void appendKeyValWithNullValue() throws UnsupportedEncodingException, URISyntaxException {
        String nullValue = null;
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", nullValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

}