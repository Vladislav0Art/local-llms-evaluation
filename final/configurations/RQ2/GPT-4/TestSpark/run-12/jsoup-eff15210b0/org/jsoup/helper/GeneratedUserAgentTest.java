package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent("Mozilla/5.0");
        assertEquals("Mozilla/5.0", conn.request().header("User-Agent"));
    }

}