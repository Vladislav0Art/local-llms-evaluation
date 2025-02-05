package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.Proxy;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        String expectedUserAgent = "Jsoup test";
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent(expectedUserAgent);

        Assert.assertEquals(expectedUserAgent, httpConnection.request().userAgent());
    }

}