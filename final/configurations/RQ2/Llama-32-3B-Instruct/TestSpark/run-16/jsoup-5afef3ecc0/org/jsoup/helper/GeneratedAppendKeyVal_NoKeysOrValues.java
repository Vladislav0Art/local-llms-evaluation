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

public class GeneratedAppendKeyVal_NoKeysOrValues {

    @Test
    public void appendKeyVal_NoKeysOrValues() {
        UrlBuilder builder = new UrlBuilder("http://example.com");
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        try {
            builder.appendKeyVal(kv1);
            builder.appendKeyVal(kv2);
            fail("Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}