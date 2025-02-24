package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUtf8Test {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUtf8Test() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/%E2%82%AC");
        urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        URL expectedUrl = new URL("http://www.example.com/€");
        assertEquals(expectedUrl, actualUrl);
    }

}