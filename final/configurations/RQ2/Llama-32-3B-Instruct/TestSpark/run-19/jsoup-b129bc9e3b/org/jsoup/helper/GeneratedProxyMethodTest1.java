package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedProxyMethodTest1 {

    @Test
    public void proxyMethodTest1() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.com", 8080));
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
    }

}