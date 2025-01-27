package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedProxyProxy {

    @Test
    public void proxyProxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("host", 8080));
        Connection conn = HttpConnection.proxy(proxy);
        assertNull(conn.request());
    }

}