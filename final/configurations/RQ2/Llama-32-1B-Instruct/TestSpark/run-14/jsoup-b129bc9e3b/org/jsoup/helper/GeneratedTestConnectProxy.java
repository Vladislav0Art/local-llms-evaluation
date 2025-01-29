package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectProxy {

    @Test
    public void testConnectProxy() {
        String host = "example.com";
        int port = 443;
        Proxy proxy = new org.jsoup.parser.Parser().parse(new java.net.InetSocketAddress(host, port));
        HttpConnection connection = new HttpConnection(proxy);
        assertEquals(proxy.getScheme(), connection.get().getScheme());
        assertEquals(proxy.getHost(), connection.get().getHost());
    }

}