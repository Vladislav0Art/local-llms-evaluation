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

public class GeneratedProxyWithHostAndPortTest {

    @Test
    public void proxyWithHostAndPortTest() {
        HttpConnection conn = new HttpConnection();
        conn.proxy("example.com", 8000);
        assertEquals("example.com", ((InetSocketAddress) conn.request().proxy().address()).getHostName());
        assertEquals(8000, ((InetSocketAddress) conn.request().proxy().address()).getPort());
    }

}