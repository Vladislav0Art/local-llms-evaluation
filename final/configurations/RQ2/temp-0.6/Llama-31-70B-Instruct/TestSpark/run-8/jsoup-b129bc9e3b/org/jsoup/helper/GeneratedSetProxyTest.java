package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedSetProxyTest {

    @Test
    public void setProxyTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080)));
        assertEquals(new InetSocketAddress("localhost", 8080), connection.getProxy().address());
    }

}