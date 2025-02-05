package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        Proxy testProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        connection.proxy(testProxy);
        assertEquals(testProxy, connection.request().proxy());
    }

}