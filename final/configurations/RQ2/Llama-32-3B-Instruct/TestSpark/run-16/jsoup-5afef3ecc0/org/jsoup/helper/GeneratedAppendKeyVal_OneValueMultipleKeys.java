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

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyVal_OneValueMultipleKeys {

    @Test
    public void appendKeyVal_OneValueMultipleKeys() {
        UrlBuilder builder = new UrlBuilder("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value");
        try {
            builder.appendKeyVal(kv1);
            fail("Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}