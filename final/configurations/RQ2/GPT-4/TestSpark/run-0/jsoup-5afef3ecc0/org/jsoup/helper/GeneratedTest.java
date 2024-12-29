package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://"));
        URL url = urlBuilder.build();
        Assert.assertEquals("http://", url.toString());
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL url = urlBuilder.build();
        Assert.assertEquals("http://example.com", url.toString());
    }

}