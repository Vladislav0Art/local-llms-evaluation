package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedProxyHostPortTest {

    @Test
    public void proxyHostPortTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy("192.168.1.1", 8080);
        Proxy proxy = httpConnection.request().proxy();
        assertEquals("192.168.1.1", proxy.address().toString());
    }

}