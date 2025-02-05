package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.Proxy;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        int expectedTimeout = 5000;
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.timeout(expectedTimeout);

        Assert.assertEquals(expectedTimeout, httpConnection.request().timeout());
    }

}