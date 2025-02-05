package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.Proxy;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        Map<String, String> expectedCookies = new HashMap<>();
        expectedCookies.put("key", "value");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookies(expectedCookies);

        Assert.assertEquals(expectedCookies, httpConnection.request().cookies());
    }

}