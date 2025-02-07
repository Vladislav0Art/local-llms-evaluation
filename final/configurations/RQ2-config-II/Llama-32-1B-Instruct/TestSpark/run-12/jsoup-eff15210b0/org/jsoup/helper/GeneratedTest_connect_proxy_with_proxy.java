package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_connect_proxy_with_proxy {

    @Test
    public void test_connect_proxy_with_proxy() throws Exception {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Protocol.TCP, AddressFamily.INET);
        connection.setProxy(proxy);
        Connection proxyConnection = HttpConnection.connect(url);
        assertNotNull(proxyConnection);
    }

}