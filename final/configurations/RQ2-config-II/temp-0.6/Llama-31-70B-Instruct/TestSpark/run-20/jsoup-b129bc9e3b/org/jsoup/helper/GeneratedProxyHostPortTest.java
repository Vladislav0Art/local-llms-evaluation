package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProxyHostPortTest {

    @Test
    public void proxyHostPortTest() {
        HttpConnection httpConn = new HttpConnection();
        String host = "example.com";
        int port = 80;
        assertEquals(httpConn, httpConn.proxy(host, port));
    }

}