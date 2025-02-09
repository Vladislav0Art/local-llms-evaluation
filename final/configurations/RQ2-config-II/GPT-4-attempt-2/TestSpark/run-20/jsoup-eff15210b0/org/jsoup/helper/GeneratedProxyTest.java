package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("localhost", 8080);
        assertEquals("localhost", connection.request().proxy().getHostName());
        assertEquals(8080, connection.request().proxy().getPort());
    }

}