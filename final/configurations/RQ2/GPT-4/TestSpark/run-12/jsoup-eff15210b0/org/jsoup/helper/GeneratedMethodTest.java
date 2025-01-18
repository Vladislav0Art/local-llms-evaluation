package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        HttpConnection conn = new HttpConnection();
        conn.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, conn.request().method());
    }

}