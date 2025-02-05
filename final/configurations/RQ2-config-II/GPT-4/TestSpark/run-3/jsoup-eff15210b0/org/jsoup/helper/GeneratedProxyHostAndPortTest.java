package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.internal.ConstrainableInputStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedProxyHostAndPortTest {

    @Test
    public void proxyHostAndPortTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("localhost", 8000);
        assertEquals(Proxy.Type.HTTP, connection.proxy().type());
        assertEquals("localhost", ((InetSocketAddress) connection.proxy().address()).getHostName());
        assertEquals(8000, ((InetSocketAddress) connection.proxy().address()).getPort());
    }

}