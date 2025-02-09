package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnsupportedEncodingException;

public class GeneratedUrlBuilderInvalidUrlTest {

    @Test
    public void UrlBuilderInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("htt://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

}