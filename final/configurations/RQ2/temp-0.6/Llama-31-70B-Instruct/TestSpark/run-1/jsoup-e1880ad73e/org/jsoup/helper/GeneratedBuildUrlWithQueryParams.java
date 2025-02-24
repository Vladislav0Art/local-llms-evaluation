package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithQueryParams {

    @Test
    public void buildUrlWithQueryParams() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com?q=search");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL buildUrl = builder.build();
        assertEquals(inputUrl.getProtocol(), buildUrl.getProtocol());
        assertEquals(inputUrl.getHost(), buildUrl.getHost());
        assertEquals(inputUrl.getQuery(), buildUrl.getQuery());
    }

}