package org.jsoup.helper;

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

import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String url = builder.build().toString();
        assertEquals("http://example.com", url);
    }

}