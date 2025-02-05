package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.Proxy;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Proxy expectedProxy = new Proxy(Proxy.Type.HTTP, null);
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy(expectedProxy);

        Assert.assertEquals(expectedProxy, httpConnection.request().proxy());
    }

}