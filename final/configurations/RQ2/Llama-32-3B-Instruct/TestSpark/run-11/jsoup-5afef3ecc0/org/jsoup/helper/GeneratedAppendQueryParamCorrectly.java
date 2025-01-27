package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendQueryParamCorrectly {

    @Test
    public void appendQueryParamCorrectly() throws MalformedURLException, UnsupportedEncodingException {
        String url = Connection.url("https://example.com").appendQueryParam("key", "value");
        assertTrue(url.contains("?key=value"));
    }

}