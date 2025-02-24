package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedProxyStringAndPortTest {

    @Test
    public void proxyStringAndPortTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.proxy("127.0.0.1", 8080);
        assertEquals("127.0.0.1", connection.getProxy().address().toString());
        assertEquals(8080, ((InetSocketAddress) connection.getProxy().address()).getPort());
    }

}