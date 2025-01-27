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

public class GeneratedBuild_SimpleUrl {

    @Test
    public void build_SimpleUrl() {
        UrlBuilder builder = new UrlBuilder("http://example.com");
        URL url = builder.build();
        assertEquals("http", url.getProtocol());
        assertEquals("example.com", url.getHost());
        assertNull(url.getPath());
        assertEquals(80, url.getPort());
        assertNull(url.getQuery());
        assertNull(url.getFragment());
    }

}