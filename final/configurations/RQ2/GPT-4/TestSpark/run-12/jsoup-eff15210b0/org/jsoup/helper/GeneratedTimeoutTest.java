package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection conn = new HttpConnection();
        conn.timeout(5000);
        assertEquals(5000, conn.request().timeout());
    }

}