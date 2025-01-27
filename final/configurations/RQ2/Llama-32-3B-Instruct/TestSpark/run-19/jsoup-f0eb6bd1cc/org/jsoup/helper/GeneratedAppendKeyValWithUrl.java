package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithUrl {

    @Test
    public void appendKeyValWithUrl() throws MalformedURLException, URISyntaxException {
        String urlValue = "http://example.com/path?query=value";
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", urlValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

}