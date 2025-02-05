package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedProxyHostPortTest {

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        Connection con = connection.proxy("localhost", 8000);
        Proxy expectedProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8000));
        assertEquals(expectedProxy, ((HttpConnection) con).request().proxy());
    }

}