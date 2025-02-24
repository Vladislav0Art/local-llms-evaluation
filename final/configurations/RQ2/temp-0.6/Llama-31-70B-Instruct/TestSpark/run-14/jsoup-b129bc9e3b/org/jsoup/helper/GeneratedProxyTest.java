package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
        connection.proxy(proxy);
        assertEquals(proxy, connection.getProxy());
    }

}