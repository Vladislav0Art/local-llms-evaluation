package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectProxy_Domain {

    @Test
    public void testConnectProxy_Domain() {
        String proxyUrl = "http://proxy.example.com:8080";
        HttpConnection connection = new HttpConnection(proxyUrl);
        assertEquals("proxy.example.com", connection.getProxy().getScheme());
        assertEquals("proxy.example.com", connection.getProxy().getHost());
    }

}