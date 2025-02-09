package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnsupportedEncodingException;

public class GeneratedUrlBuilderValidUrlTest {

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

}