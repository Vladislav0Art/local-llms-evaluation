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

public class GeneratedAppendKeyValWithSpaceTest {

    @Test
    public void appendKeyValWithSpaceTest() throws UnsupportedEncodingException, URISyntaxException {
        String baseUrl = "http://example.com/base";
        UrlBuilder builder = new UrlBuilder(new URI(baseUrl));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value with space");
        String expectedUrl = baseUrl + "?" + StringUtil.toString(kv);
        String actualUrl = (String) builder.appendKeyValue(kv).build();
        assertEquals(expectedUrl, actualUrl);
    }

}