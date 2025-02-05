package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedConnectProxyTest {

    @Test
    public void connectProxyTest() throws IOException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection connection = HttpConnection.connect("https://www.example.com").proxy(proxy);
        Assert.assertEquals(proxy, connection.request().proxy());
    }

}