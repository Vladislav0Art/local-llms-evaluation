package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection conn = new HttpConnection();
        conn.url(new URL("http://example.com"));
        assertEquals("http://example.com", conn.request().url().toString());
    }

}