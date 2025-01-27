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

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValWithEncodingTest {

    @Test
    public void appendKeyValWithEncodingTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value with spaces");
        String expectedUrl = "http://example.com/path?key=value+with+spaces";
        builder.appendKeyVal(kv);
        assertEquals(expectedUrl, StringUtil.toString(builder.build()));
    }

}