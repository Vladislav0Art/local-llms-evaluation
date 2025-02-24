package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection httpConn = new HttpConnection();
        Proxy proxy = mock(Proxy.class);
        assertEquals(httpConn, httpConn.proxy(proxy));
    }

}