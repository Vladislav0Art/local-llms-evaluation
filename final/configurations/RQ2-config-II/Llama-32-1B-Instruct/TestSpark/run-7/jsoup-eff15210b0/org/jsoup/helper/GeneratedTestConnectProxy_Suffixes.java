package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectProxy_Suffixes {

    @Test
    public void testConnectProxy_Suffixes() {
        String proxyUrl = "http://proxy.example.com:8080";
        HttpConnection connection = new HttpConnection(proxyUrl);
        assertTrue(connection.proxy(new Proxy(proxyUrl)).getHost().equals("proxy.example.com"));
        assertEquals("https://www.example.net", connection.proxy(new Proxy(proxyUrl)).getHost());
    }

}