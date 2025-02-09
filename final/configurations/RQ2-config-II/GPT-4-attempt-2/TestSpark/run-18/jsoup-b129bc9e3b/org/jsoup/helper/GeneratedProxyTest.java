package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Proxy proxy = Mockito.mock(Proxy.class);
        HttpConnection connection = new HttpConnection();
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

}