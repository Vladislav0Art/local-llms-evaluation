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

public class GeneratedAppendNonStringValueTest {

    @Test
    public void appendNonStringValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv = Connection.KeyVal.of("key", 123L);
        String expectedUrl = "http://example.com/path?key=123";
        builder.appendKeyVal(kv);
        assertEquals(expectedUrl, StringUtil.toString(builder.build()));
    }

}