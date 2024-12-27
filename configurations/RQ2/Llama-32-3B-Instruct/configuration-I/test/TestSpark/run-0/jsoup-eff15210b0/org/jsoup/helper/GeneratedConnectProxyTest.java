package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectProxyTest {

    @Test
    public void connectProxyTest() {
        String host = "proxy.example.com";
        int port = 8080;
        Proxy proxy = Mockito.mock(Proxy.class);
        Request request = new Request("http://example.com");
        HttpConnection connection = new HttpConnection(request, proxy);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.proxy(proxy));
    }

}