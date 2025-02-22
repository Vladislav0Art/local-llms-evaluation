package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

public class GeneratedBuildUrlWithSpecialCharactersInQuery {

    @Test
    public void buildUrlWithSpecialCharactersInQuery() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/test?q=test&a=b&c=d");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL normalizedUrl = urlBuilder.build();
        assertEquals("http://www.example.com/test?q=test&a=b&c=d", normalizedUrl.toString());
    }

}