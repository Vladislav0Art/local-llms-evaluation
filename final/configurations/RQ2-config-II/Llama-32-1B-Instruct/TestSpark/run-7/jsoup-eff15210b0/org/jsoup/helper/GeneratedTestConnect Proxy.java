package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnect Proxy {

    @Test
    public void testConnect

    Proxy() {
        String proxyUrl = "http://proxy.example.com:8080";
        HttpConnection connection = new HttpConnection(proxyUrl);
        assertTrue(connection.proxy(new Proxy(proxyUrl)));
        assertEquals(proxyUrl, connection.getProxy().getScheme());
        assertEquals("http", connection.getProxy().getHost());
    }

}