package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.Proxy;

public class GeneratedFollowRedirectsTest {

    @Test
    public void followRedirectsTest() {
        boolean expectedFollowRedirects = true;
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.followRedirects(expectedFollowRedirects);

        Assert.assertEquals(expectedFollowRedirects, httpConnection.request().followRedirects());
    }

}