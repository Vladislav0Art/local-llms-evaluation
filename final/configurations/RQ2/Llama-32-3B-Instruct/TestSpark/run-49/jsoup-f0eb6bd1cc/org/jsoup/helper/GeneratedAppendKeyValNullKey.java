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

import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValNullKey {

    @Test
    public void appendKeyValNullKey() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        buildUrlWithKeyVal(builder, kv);
    }

}