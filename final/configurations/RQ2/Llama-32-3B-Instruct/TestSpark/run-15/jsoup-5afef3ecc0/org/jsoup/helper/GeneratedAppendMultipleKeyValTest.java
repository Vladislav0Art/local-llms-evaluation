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

public class GeneratedAppendMultipleKeyValTest {

    @Test
    public void appendMultipleKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv1 = Connection.KeyVal.of("key1", "value1");
        Connection.KeyVal kv2 = Connection.KeyVal.of("key2", "value2");
        String expectedUrl = "http://example.com/path?key1=value1&key2=value2";
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals(expectedUrl, StringUtil.toString(builder.build()));
    }

}