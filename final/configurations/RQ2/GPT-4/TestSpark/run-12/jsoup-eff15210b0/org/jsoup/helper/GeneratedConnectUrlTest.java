package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(conn);
    }

}