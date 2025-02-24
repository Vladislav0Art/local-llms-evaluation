package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import static org.junit.Assert.*;

public class GeneratedTestProxy {

    private HttpConnection httpConnection;

    @Before
    public void initialize() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testProxy() {
        httpConnection.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 80)));
        assertEquals(Proxy.Type.HTTP, httpConnection.request().proxy().type());
    }

}