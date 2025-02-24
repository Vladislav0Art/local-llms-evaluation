package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.DIRECT, new InetSocketAddress("localhost", 8080));
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

}