package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
        HttpConnection conn = new HttpConnection();
        Connection returnConn = conn.proxy(proxy);
        assertNotNull(returnConn);
    }

}