package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.net.URLDecoder;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildUrlWithoutQuery() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://example.com/", outputUrl.toString());
    }

    @Test
    public void buildUrlWithQuery() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/?a=b&c=d");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://example.com/?a=b&c=d", outputUrl.toString());
    }

    @Test
    public void buildUrlWithUnencodedQuery() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/?a=b+c");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://example.com/?a=b%2Bc", outputUrl.toString());
    }

}