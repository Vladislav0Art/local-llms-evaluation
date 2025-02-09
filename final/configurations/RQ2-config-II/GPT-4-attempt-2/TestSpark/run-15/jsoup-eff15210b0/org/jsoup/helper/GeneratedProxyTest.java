package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Proxy testProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        HttpConnection connection = new HttpConnection();
        connection.proxy(testProxy);
        assertEquals(testProxy, connection.request().proxy());
    }

}