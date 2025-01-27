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

public class GeneratedAppendQueryParam_MultipleParams {

    @Test
    public void appendQueryParam_MultipleParams() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = Connection.KeyVal.of("key1", "value1");
        Connection.KeyVal kv2 = Connection.KeyVal.of("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("key1=value1&key2=value2", builder.build().toString());
    }

}