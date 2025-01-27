package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.KeyVal;
import org.jsoup.internal.StringUtil;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValAppendValueWithoutKeyTest {

    @Test
    public void appendKeyValAppendValueWithoutKeyTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = null;
        builder.appendKeyVal(kv);
        assertEquals(true, StringUtil.hasNonEmptyValue(builder.build()));
    }

}