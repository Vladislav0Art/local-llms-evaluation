package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.junit.Test;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080)));
        assertEquals("localhost", connection.request().proxy().address().toString());
        assertEquals(8080, connection.request().proxy().address().getPort());
    }

}