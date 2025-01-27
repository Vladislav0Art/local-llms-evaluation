package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendQueryParam_SingleParam {

    @Test
    public void appendQueryParam_SingleParam() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("key=value", builder.build().toString());
    }

}