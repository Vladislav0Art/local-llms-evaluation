package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProxyWithProxyObjectTest {

    @Test
    public void proxyWithProxyObjectTest() {
        HttpConnection conn = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8000));
        conn.proxy(proxy);
        assertEquals(proxy, conn.request().proxy());
    }

}