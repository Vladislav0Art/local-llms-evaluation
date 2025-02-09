package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy("localhost", 8080);
        assertEquals("localhost", connection.request().proxy().getHost());
        assertEquals(8080, connection.request().proxy().getPort());
    }

}