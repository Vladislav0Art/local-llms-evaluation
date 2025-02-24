package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.IDN;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void buildWithValidUrlTest() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com/"));
        URL result = builder.build();
        assertEquals("http://www.example.com/", result.toString());
    }

    @Test
    public void buildWithInvalidUrlTest() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com/%"));
        builder.build();
    }

    @Test
    public void buildWithNullUrlTest() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        assertEquals("", result.toString());
    }

}