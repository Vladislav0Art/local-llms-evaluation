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

public class GeneratedAppendKeyValAppendUrlTest {

    @Test
    public void appendKeyValAppendUrlTest() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String url = "https://www.example.com";
        builder.appendKeyVal(Connection.KeyVal("", url));
        assertEquals(url, builder.build().toString());
    }

}