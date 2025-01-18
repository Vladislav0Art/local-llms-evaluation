package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        HttpConnection conn = new HttpConnection();
        conn.proxy(proxy);
        assertEquals(conn.request().proxy(), proxy);
    }

}