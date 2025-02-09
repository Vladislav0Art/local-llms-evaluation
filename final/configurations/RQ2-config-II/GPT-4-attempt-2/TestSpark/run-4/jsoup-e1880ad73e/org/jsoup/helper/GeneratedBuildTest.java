package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        final String expectedUrl = "http://www.google.com";
        UrlBuilder builder = new UrlBuilder(new URL(expectedUrl));
        URL actualUrl = builder.build();
        Assert.assertEquals(expectedUrl, actualUrl.toString());
    }

}