package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.1", 8080));
        Connection result = httpConnection.proxy(proxy);
        Assert.assertNotNull(result);
    }

}