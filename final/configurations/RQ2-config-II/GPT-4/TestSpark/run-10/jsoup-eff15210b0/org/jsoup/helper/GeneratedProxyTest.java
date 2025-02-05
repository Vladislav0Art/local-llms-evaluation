package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("192.168.1.1", 8080);
        assertNotNull(connection.proxy());
    }

}