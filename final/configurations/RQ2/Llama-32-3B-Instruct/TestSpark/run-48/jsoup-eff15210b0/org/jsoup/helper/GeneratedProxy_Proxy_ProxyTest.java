package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedProxy_Proxy_ProxyTest {

    @Test
    public void proxy_Proxy_ProxyTest() {
        Proxy.Type httpType = Proxy.Type.HTTP
        InetSocketAddress address = new InetSocketAddress("proxy.example.com", 8080) as InetSocketAddress?
        Connection conn = HttpConnection.proxy(httpType, address)
        assertNotNull(conn)
    }

}