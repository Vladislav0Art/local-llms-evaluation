package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.Proxy;

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        String expectedUrl = "http://example.com";
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(expectedUrl);

        Assert.assertEquals(expectedUrl, httpConnection.request().url().toString());
    }

}