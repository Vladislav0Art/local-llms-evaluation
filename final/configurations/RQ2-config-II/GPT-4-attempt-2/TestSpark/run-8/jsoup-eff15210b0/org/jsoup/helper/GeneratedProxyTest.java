package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() throws Exception {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, null);
        HttpConnection connection = new HttpConnection();
        assertEquals(proxy, connection.proxy(proxy).request().proxy());
    }

}